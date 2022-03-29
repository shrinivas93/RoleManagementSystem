package com.shri.rolemanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "action")
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "action")
    private Set<Permission> permissions = new LinkedHashSet<>();

}