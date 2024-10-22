package com.ltc.laresspringlearning.repository;

import com.ltc.laresspringlearning.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
