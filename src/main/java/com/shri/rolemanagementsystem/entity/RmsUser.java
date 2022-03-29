package com.shri.rolemanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "rms_user")
public class RmsUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "rmsUser")
    private Set<RmsUserRoleAssignment> rmsUserRoleAssignments = new LinkedHashSet<>();

}