package com.crud.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
  
}
