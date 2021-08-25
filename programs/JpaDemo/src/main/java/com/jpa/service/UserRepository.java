package com.jpa.service;

import com.jpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {

    List<Users> findByRole();
}
