package com.greatlearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.greatlearning.model.Teacher;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg =  new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Teacher t1 =  new Teacher();
        t1.setF_Name("Navodit");
        t1.setL_Name("Pan");
        t1.setEmail("navoditp11@gmail.com");
        session.save(t1);
        
        Teacher t2 =  new Teacher();
        t2.setF_Name("Anjali");
        t2.setL_Name("Das");
        t2.setEmail("anjalidas11@gmail.com");
        session.save(t2);
        
        t2.setEmail("das_anjali@gmail.com");
        session.update(t2);
        Teacher t3 = (Teacher)session.get(Teacher.class, 2);
        System.out.println(t3);
        session.delete(t3);
        
        tx.commit();
        session.close();
        factory.close();
    }
}
