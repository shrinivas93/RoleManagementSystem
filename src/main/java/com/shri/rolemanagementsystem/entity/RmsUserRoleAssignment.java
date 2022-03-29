package com.shri.rolemanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rms_user_role_assignment")
public class RmsUserRoleAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rms_user_id")
    private RmsUser rmsUser;

}