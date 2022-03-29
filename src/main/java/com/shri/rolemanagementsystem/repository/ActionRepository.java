package com.shri.rolemanagementsystem.repository;

import com.shri.rolemanagementsystem.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action, Integer> {
}