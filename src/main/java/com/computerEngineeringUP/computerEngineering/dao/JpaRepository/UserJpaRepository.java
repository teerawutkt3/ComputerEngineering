package com.computerEngineeringUP.computerEngineering.dao.JpaRepository;

import org.springframework.data.repository.CrudRepository;

import com.computerEngineeringUP.computerEngineering.dao.entity.User;

public interface UserJpaRepository extends CrudRepository<User, Integer>{

}
