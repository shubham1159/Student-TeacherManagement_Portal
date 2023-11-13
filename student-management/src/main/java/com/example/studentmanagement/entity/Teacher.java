package com.example.studentmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
    @Id  //this indicates that the id attribute is the id for the table
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //this is used for auto incrimentation of the id
    private int Id;
    private String Name;
    private String Subject;
    private String Contact;

    public Teacher(int id, String name, String subject, String contact) {
        super();
        this.Id = id;
        this.Name = name;
        this.Subject = subject;
        this.Contact = contact;
    }
    public Teacher(){
        super();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }


}
