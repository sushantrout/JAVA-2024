package com.un.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "my_employee")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
