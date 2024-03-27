$("#bg-modal").on("click", () => {
    $("#modal")[0].style.display = "none"
    document.body.style.overflow = "auto"
})

$("#close-modal").on("click", ()=> {
    $("#modal")[0].style.display = "none"
    document.body.style.overflow = "auto"
})

function convertirCoordenadas(consulta) {
    var coordsString = consulta.replace("MULTIPOLYGON Z (((", "").replace(")))", "");
    var coords = coordsString.split(",").map(function(point) {
        var coordsZ = point.trim().split(" ").map(parseFloat);
        return [coordsZ[1], coordsZ[0]];
    });
    return coords;
}

if (geometriasTerrenos.length > 0) {
    var terrenos = L.map('terrenos');
    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(terrenos);
}

if (coordenadasConstruccion.length > 0) {
    var construcciones = L.map('construcciones');
    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(construcciones);
}

if (coordenadasUnidadConstruccion.length > 0) {
    var uconstrucciones = L.map('uconstrucciones');
    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(uconstrucciones);
}

geometriasTerrenos.forEach(function(coordenadas) {
    var coordsLeaflet = convertirCoordenadas(coordenadas);
    var polygon = L.polygon(coordsLeaflet).addTo(terrenos);

    // Obtener los límites del polígono
    var bounds = polygon.getBounds();

    // Ajustar el centro del mapa y el zoom para que los polígonos sean visibles
    terrenos.fitBounds(bounds);
});

coordenadasConstruccion.forEach(function(coordenadas) {
    var coordsLeaflet = convertirCoordenadas(coordenadas);
    var polygon = L.polygon(coordsLeaflet).addTo(construcciones);

    // Obtener los límites del polígono
    var bounds = polygon.getBounds();

    // Ajustar el centro del mapa y el zoom para que los polígonos sean visibles
    construcciones.fitBounds(bounds);
});

coordenadasUnidadConstruccion.forEach(function(coordenadas) {
    var coordsLeaflet = convertirCoordenadas(coordenadas);
    var polygon = L.polygon(coordsLeaflet).addTo(uconstrucciones);

    // Obtener los límites del polígono
    var bounds = polygon.getBounds();

    // Ajustar el centro del mapa y el zoom para que los polígonos sean visibles
    uconstrucciones.fitBounds(bounds);
});

function See_Interesado (t_id) {
    const modal = document.getElementById("modal-body")
    modal.innerHTML = ""
    document.getElementById("modal").style.display = "block"
    document.body.style.overflow = "hidden"
    $.ajax({
        url: `http://localhost:3000/ric_interesado/${t_id}`,
        type: "POST",
        datatype: "JSON",
        success: (interesado) => {
            const nombre = document.createElement("h2")
            nombre.innerText = `Nombre: ${interesado.nombre}`
            modal.appendChild(nombre)
            const tipodocumento = document.createElement("p")
            tipodocumento.innerText = `Tipo de documento: ${interesado.ric_interesadodocumentotipo.dispname}`
            modal.appendChild(tipodocumento)
            const dociden = document.createElement ("p")
            dociden.innerText = `Número de documento: ${interesado.documento_identidad}`
            modal.appendChild(dociden)
            const close_modal_button = document.createElement("button")
            close_modal_button.id = "close-modal"
            close_modal_button.innerText = "x"
            close_modal_button.addEventListener("click", () => {
                document.getElementById("modal").style.display = "none"
                document.body.style.overflow = "auto"
            })
            modal.appendChild(close_modal_button)
            const scroll_table_modal = document.createElement("div")
            scroll_table_modal.className = "scrool-table-modal"
            const modal_table = document.createElement("table")
            modal_table.className = "tablas-consultas"
            const modal_thead = document.createElement("thead")
            modal_table.appendChild(modal_thead)
            const ths = ["Codigo Homologado", "Numero Predial", "Numero predial Anterior", "Matricula inmobiliaria", "Ver"]
            ths.forEach((e) => {
                const th = document.createElement("th")
                th.innerHTML = e
                modal_thead.appendChild(th)
            })
            const modal_tbody = document.createElement("tbody")
            $.ajax({
                url: `http://localhost:3000/predioDetalleInteresado/${t_id}`,
                type: "POST",
                datatype: "JSON",
                success: (tabledata) => {
                    tabledata.forEach((e) => {
                        const tr = document.createElement("tr")
                        const ch = document.createElement("td")
                        ch.innerHTML = e.codigo_homologado
                        tr.appendChild(ch)
                        const np = document.createElement("td")
                        np.innerHTML = e.numero_predial
                        tr.appendChild(np)
                        const npa = document.createElement("td")
                        npa.innerHTML = e.numero_predial_anterior
                        tr.appendChild(npa)
                        const mi = document.createElement("td")
                        mi.innerHTML = e.matricula_inmobiliaria
                        tr.appendChild(mi)
                        const see = document.createElement("td")
                        see.style.backgroundColor = "black"
                        const seeButton = document.createElement("button")
                        seeButton.addEventListener("click", () => window.open(predio+e.predio, "_blank"))
                        seeButton.innerText = "Ver mas"
                        seeButton.target = "_blank"
                        see.appendChild(seeButton)
                        tr.appendChild(see)
                        modal_tbody.appendChild(tr)
                    })
                    modal_table.appendChild(modal_tbody)
                    scroll_table_modal.appendChild(modal_table)
                    modal.appendChild(scroll_table_modal)
                }
            })

        }
    })
}
function showSection(sectionId) {
    // Ocultar todas las secciones
    var sections = document.querySelectorAll('section');
    sections.forEach(function(section) {
        section.style.display = 'none';
    });

    // Quitar la clase 'active' de todos los botones
    var buttons = document.querySelectorAll('#sidebar ul li');
    buttons.forEach(function(button) {
        button.classList.remove('active');
    });

    // Mostrar la sección correspondiente y resaltar el botón
    document.getElementById(sectionId).style.display = 'block';
}