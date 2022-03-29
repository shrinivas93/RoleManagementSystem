package com.shri.rolemanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "resource")
    private Set<Permission> permissions = new LinkedHashSet<>();

}