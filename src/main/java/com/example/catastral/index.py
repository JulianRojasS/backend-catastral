nombres = ['temporal_interesados']
tipos = ['Repository', 'Controller', 'Service']

def crear (nombre, tipo, i):
    routes = ['Repositories', 'Controllers', 'Services']
    with open (f'{routes[i]}/{nombre}{tipo}.java', 'w+') as archivo:
        Enombre = nombre[0].upper() + nombre[0+1:]
        contenido = ''
        if (tipo == 'Repository'):
            contenido = 'package com.example.catastral.Repositories;\n\nimport com.example.catastral.Entities.'+Enombre+';\nimport org.springframework.data.repository.CrudRepository;\nimport org.springframework.stereotype.Repository;\n\n@Repository\npublic interface '+nombre + tipo +' extends CrudRepository<'+Enombre+', Integer> {\n\n}\n'
        elif (tipo == 'Controller'):
            contenido = 'package com.example.catastral.Controllers;\n\nimport com.example.catastral.Entities.'+Enombre+';\nimport com.example.catastral.Services.'+nombre+'Service;\nimport org.springframework.web.bind.annotation.CrossOrigin;\nimport org.springframework.web.bind.annotation.GetMapping;\nimport org.springframework.web.bind.annotation.PathVariable;\nimport org.springframework.web.bind.annotation.RestController;\n\nimport java.util.ArrayList;\n\n@RestController\n@CrossOrigin(origins = "*", maxAge = 3600)\npublic class '+nombre+'Controller {\n\n    private '+nombre+'Service service;\n\n    public '+nombre+'Controller('+nombre+'Service service){\n        this.service = service;\n    }\n\n    @GetMapping("/'+nombre+'s")\n    public ArrayList<'+Enombre+'> todo () {\n        return service.todo();\n    }\n\n    @GetMapping("/'+nombre+'/{t_id}")\n    public '+Enombre+' '+nombre+' (@PathVariable("t_id") Integer t_id) {\n        return service.'+nombre+'(t_id);\n    }\n}'
        elif (tipo == 'Service'):
            contenido = 'package com.example.catastral.Services;\n\nimport com.example.catastral.Entities.'+Enombre+';\nimport com.example.catastral.Repositories.'+nombre+'Repository;\nimport org.springframework.stereotype.Service;\n\nimport java.util.ArrayList;\nimport java.util.List;\nimport java.util.Map;\n\n@Service\npublic class '+nombre+'Service {\n    private '+nombre+'Repository repository;\n\n    public '+nombre+'Service ('+nombre+'Repository repository){\n        this.repository = repository;\n    }\n\n    public ArrayList<'+Enombre+'> todo () {\n        return (ArrayList<'+Enombre+'>) repository.findAll();\n    }\n\n    public '+Enombre+' '+nombre+' (Integer t_id) {\n        return repository.findById(t_id).get();\n    }\n}'
        archivo.write(contenido)

def crearArchivos():
    for tipo in tipos:
        for nombre in nombres:
            crear(nombre, tipo, tipos.index(tipo))
        
def editar (nombre):
    with open (f'Entities/{nombre}.java', 'r') as archivo_leer:
        archivo = archivo_leer.read()
        nuevo = archivo.replace('LAZY)\n    private Set', 'LAZY)\n    @JsonIgnore\n    private Set')
        with open (f'Entities/{nombre}.java', 'w') as archivo_editar:
            archivo_editar.write(nuevo)

def editarArchivos():
    nombres = ['Cc_metodooperacion','Ci_forma_presentacion_codigo','Col_areatipo','Col_areavalor','Col_baunitcomointeresado','Col_baunitfuente','Col_cclfuente','Col_clfuente','Col_contenidoniveltipo','Col_dimensiontipo','Col_estadodisponibilidadtipo','Col_estadoredserviciostipo','Col_estructuratipo','Col_fuenteadministrativatipo','Col_fuenteespacialtipo','Col_grupointeresadotipo','Col_interpolaciontipo','Col_iso19125_tipo','Col_masccl','Col_mascl','Col_menosccl','Col_menoscl','Col_metodoproducciontipo','Col_miembros','Col_puntoccl','Col_puntocl','Col_puntofuente','Col_puntotipo','Col_redserviciostipo','Col_registrotipo','Col_relacionfuente','Col_relacionfuenteuespacial','Col_relacionsuperficietipo','Col_responsablefuente','Col_rrrfuente','Col_topografofuente','Col_transformacion','Col_uebaunit','Col_uefuente','Col_ueuegrupo','Col_unidadadministrativabasicatipo','Col_unidadedificaciontipo','Col_unidadfuente','Col_volumentipo','Col_volumenvalor','Extarchivo','Extdireccion','Extdireccion_clase_via_principal','Extdireccion_sector_ciudad','Extdireccion_sector_predio','Extdireccion_tipo_direccion','Extinteresado','Extredserviciosfisica','Extunidadedificacionfisica','Fraccion','Gm_curve2dlistvalue','Gm_curve3dlistvalue','Gm_geometry2dlistvalue','Gm_multicurve2d','Gm_multicurve3d','Gm_multisurface2d','Gm_multisurface3d','Gm_surface2dlistvalue','Gm_surface3dlistvalue','Imagen','Ric_agrupacioninteresados','Ric_caracteristicasunidadconstruccion','Ric_catastrotipo','Ric_condicionprediotipo','Ric_construccion','Ric_construcciontipo','Ric_datosphcondominio','Ric_derecho','Ric_derechotipo','Ric_destinacioneconomicatipo','Ric_dominioconstrucciontipo','Ric_estadociviltipo','Ric_estadotipo','Ric_fuenteadministrativa','Ric_fuenteespacial','Ric_gestorcatastral','Ric_grupoetnicotipo','Ric_interesado','Ric_interesadodocumentotipo','Ric_interesadotipo','Ric_mutaciontipo','Ric_nu_agrupacionunidadesespaciales','Ric_nu_cadenacaraslimite','Ric_nu_caraslindero','Ric_nu_espaciojuridicoredservicios','Ric_nu_espaciojuridicounidadedificacion','Ric_nu_nivel','Ric_nu_punto','Ric_nu_relacionnecesariabaunits','Ric_nu_relacionnecesariaunidadesespaciales','Ric_operadorcatastral','Ric_predio','Ric_predio_copropiedad','Ric_predio_informalidad','Ric_predio_tramitecatastral','Ric_sexotipo','Ric_terreno','Ric_tramitecatastral','Ric_unidadconstruccion','Ric_unidadconstrucciontipo','Ric_usouconstipo','Ric_zonatipo','Users']
    for nombre in nombres:
        editar(nombre)
        
editarArchivos()