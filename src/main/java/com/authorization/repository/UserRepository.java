package com.authorization.repository;

import org.springframework.data.repository.CrudRepository;

import com.authorization.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
