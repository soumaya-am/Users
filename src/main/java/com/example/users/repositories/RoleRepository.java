package com.example.users.repositories;

import com.example.users.entities.Role;
import com.example.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName);
}
