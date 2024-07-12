package com.intern.crm_system.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    // Constructors, getters, and setters

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    // Getters and setters (omitted for brevity)

    // toString, equals, and hashCode methods (omitted for brevity)
}

