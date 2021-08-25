package com.springbatch.springbatch1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbatch.springbatch1.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
