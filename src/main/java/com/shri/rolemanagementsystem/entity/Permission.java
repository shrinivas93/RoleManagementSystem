package com.shri.rolemanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "action_id")
    private Action action;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @OneToMany(mappedBy = "permission")
    private Set<RolePermission> rolePermissions = new LinkedHashSet<>();

}