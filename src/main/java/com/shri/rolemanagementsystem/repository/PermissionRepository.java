package com.shri.rolemanagementsystem.repository;

import com.shri.rolemanagementsystem.entity.Action;
import com.shri.rolemanagementsystem.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}