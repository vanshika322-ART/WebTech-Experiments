package com.example.exp9;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        Scanner sc = new Scanner(System.in);
        System.out.println("===== Student Management System =====");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter course: ");
        String course = sc.nextLine();
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        Transaction tx = session.beginTransaction();
        Student s1 = new Student(name, course, balance);
        session.save(s1);
        tx.commit();

        System.out.println("✅ Student added: " + s1);
        session.close();
        factory.close();
    }
}
