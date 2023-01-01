package com.HostelManagement.Springboot.hostelManagement.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "students")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "firstname",nullable = false)
    private String firstName;
    @Column(name = "lastname",nullable = false)
    private String lastName;
    @Column(name = "email",nullable = false)
    private String email;

    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
