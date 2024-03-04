package com.example.catastral.Repositories;

import com.example.catastral.Entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends CrudRepository<Users, Integer> {

}
