package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeded_demo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        emptable stu = new emptable();
        stu.setId(1);
        stu.setName("aman");
        stu.setCity("Delhi");


        Certificate certi = new Certificate();
        certi.setCourse("android");
        certi.setDuration("2 months");
        stu.setcerti(certi);


        emptable stu1 = new emptable();
        stu1.setId(2);
        stu1.setName("avinash");
        stu1.setCity("Delhi");


        Certificate certi1 = new Certificate();
        certi1.setCourse("ECE");
        certi1.setDuration("4 years");
        stu1.setcerti(certi1);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();


        //object save:
        s.persist(stu);
        s.persist(stu1);
        tx.commit();


        

        s.close();
        factory.close();

    }
}
