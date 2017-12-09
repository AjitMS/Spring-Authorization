package com.authorization.service;

import java.util.List;

import com.authorization.domain.User;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

}
