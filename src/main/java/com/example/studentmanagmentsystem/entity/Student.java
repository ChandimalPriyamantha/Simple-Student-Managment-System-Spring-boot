package com.example.studentmanagmentsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// @Entity annotation specifies that the class is an entity.
// @Table() annotation specifies the table in the database with which this entity is mapped
@Entity
@Table(name = "students")
public class Student
{
    //@Id annotation specifies the primary key of the entity
    @Id
    private long id;
    private  String firstName;
    private String LastName;
    private String email;

    public Student() {

    }

    public Student(String firstName, String lastName, String email) {
        super();
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
