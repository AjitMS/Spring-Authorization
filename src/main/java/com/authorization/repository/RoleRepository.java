package com.authorization.repository;

import org.springframework.data.repository.CrudRepository;

import com.authorization.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
