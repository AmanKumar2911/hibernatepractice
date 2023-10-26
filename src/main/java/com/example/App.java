package com.example;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        // Configuration cfg = new Configuration();
        // cfg.configure("hibernate.cfg.");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();


        // System.out.println(factory);
        // System.out.println(factory.isClosed());


        //creating student

        emptable st = new emptable();
        st.setId(102);
        st.setCity("Delhi");
        st.setName("avinash");

        System.out.println(st);

        Session session = factory.openSession();
        ///

        Transaction tx  = session.beginTransaction();

        // session.save(st);
        session.persist(st);
        tx.commit();


        session.close();

        



    } 
}
