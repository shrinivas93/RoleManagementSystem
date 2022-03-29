package com.shri.rolemanagementsystem.repository;

import com.shri.rolemanagementsystem.entity.RmsUser;
import com.shri.rolemanagementsystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RmsUserRepository extends JpaRepository<RmsUser, Integer> {
}