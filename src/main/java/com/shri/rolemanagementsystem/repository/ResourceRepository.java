package com.shri.rolemanagementsystem.repository;

import com.shri.rolemanagementsystem.entity.Permission;
import com.shri.rolemanagementsystem.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}