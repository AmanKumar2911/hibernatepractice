package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class carMain {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        car c = new car();
        c.setId(3);
        c.setName("Mercedes");

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(c);
        tx.commit();

        System.out.println(c);
        

        session.close();
        factory.close();

    }
}
