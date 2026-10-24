package com.platform.jpa.hibernate.entity;

import jakarta.persistence.*;
import lombok.*;


/**
 * We use lombok to generate getters, setters, constructors, and other boilerplate code for the Employee class.
 * The @Entity annotation marks this class as a JPA entity, and the @Table annotation specifies the name of the database table to which this entity will be mapped.
 * The @Id annotation marks the id field as the primary key, and the @GeneratedValue annotation specifies that the id will be generated automatically by the database.
 * The @Column annotations specify the column names and constraints for the other fields in the Employee class.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;

}



