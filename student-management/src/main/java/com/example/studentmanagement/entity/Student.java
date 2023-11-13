package com.example.studentmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {



    @Id  //this indicates that the id attribute is the id for the table
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //this is used for auto incrimentation of the id
    private int Id;
    private String Name;
    private String Fname;

    private String Course;

    private  String Fees;

    private String Contact;

    public Student(int id, String name, String fname, String course, String fees, String contact) {
        super();
       this.Id = id;
        this.Name = name;
        this.Fname = fname;
        this.Course = course;
        this.Fees = fees;
        this.Contact = contact;

    }
    public Student(){
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

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getCourse(){
        return Course;
    }
    public void setCourse(String course) {Course = course;}

    public String getFees(){
        return Fees;
    }
    public void setFees(String fees) {Fees = fees;}

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
