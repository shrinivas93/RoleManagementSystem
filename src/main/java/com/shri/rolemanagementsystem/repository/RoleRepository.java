package com.shri.rolemanagementsystem.repository;

import com.shri.rolemanagementsystem.entity.Resource;
import com.shri.rolemanagementsystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}