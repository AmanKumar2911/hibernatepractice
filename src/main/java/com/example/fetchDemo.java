package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchDemo {
    public static void main(String[] args) {
        //get , load.

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        //get-emptable ID:106//
        emptable emp=(emptable)session.get(emptable.class,106);
        // emptable emp1=(emptable)session.load(emptable.class,106);
        System.out.println(emp);
        System.out.println(emp.getCity());
        // System.out.println(emp1);




        session.close();
        factory.close();

    }
}
