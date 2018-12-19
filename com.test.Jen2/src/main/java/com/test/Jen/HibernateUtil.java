package com.test.Jen;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	Configuration config = new Configuration().configure(new File("C:\\Users\\rohini.prabhakar.ige\\Documents\\Rohini\\com.test.Jen\\hibernate.cfg.xml"));
            return config.buildSessionFactory();
 
        }
        catch(HibernateException ex){
            System.out.println("Problem creating session factory" +ex);
            ex.printStackTrace();
            return null;
       }
		
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
    	// Close caches and connection pools
    	getSessionFactory().close();
    }
}
