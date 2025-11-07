package com.example.exp9;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "course")
    private String course;

    @Column(name = "balance")
    private double balance;

    public Student() {}
    public Student(String name, String course, double balance) {
        this.name = name;
        this.course = course;
        this.balance = balance;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public double getBalance() { return balance; }

    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }
    public void setBalance(double balance) { this.balance = balance; }

    @Override
    public String toString() {
        return id + ": " + name + " (" + course + ") - Balance: " + balance;
    }
}
