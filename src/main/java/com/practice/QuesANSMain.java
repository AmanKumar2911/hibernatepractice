package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuesANSMain {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();


        //creation question
        question q1 = new question();
        q1.setId(1212);
        q1.setQues("what is java ?");
        
        //creating answer
        Answer ans = new Answer();
        ans.setId(343);
        ans.setAns("Java is programing language");
        ans.setQuest(q1);
        
        q1.setAnswer(ans);

        //session 

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        //save
        s.persist(q1); 
        s.persist(ans); 
        tx.commit();

        s.close();
        factory.close();

    }
}
