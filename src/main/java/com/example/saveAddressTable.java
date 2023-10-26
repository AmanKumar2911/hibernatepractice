package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class saveAddressTable {
    public static void main(String[] args) throws IOException {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Address ad = new Address();
        ad.setStreet("Street2");
        ad.setCity("Bihar");
        ad.set_Open(false);
        ad.setAddedDate(new Date());
        ad.setX(1234.3456);

        //reading image
        FileInputStream fis = new FileInputStream("src\\main\\resources\\amanpic.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        fis.close();
        
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();
        session.persist(ad);
        tr.commit();
        session.close();
        System.out.println("Done");
        


    }
}
