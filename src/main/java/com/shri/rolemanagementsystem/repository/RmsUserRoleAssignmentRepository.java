package com.shri.rolemanagementsystem.repository;

import com.shri.rolemanagementsystem.entity.RmsUser;
import com.shri.rolemanagementsystem.entity.RmsUserRoleAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RmsUserRoleAssignmentRepository extends JpaRepository<RmsUserRoleAssignment, Integer> {
}