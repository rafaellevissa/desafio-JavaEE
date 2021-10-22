package com.app.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.spring.datajpa.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
