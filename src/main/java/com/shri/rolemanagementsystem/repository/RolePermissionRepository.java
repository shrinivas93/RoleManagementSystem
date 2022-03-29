package com.shri.rolemanagementsystem.repository;

import com.shri.rolemanagementsystem.entity.Role;
import com.shri.rolemanagementsystem.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, Integer> {
}