package com.test.Jen;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.test.Jen.HibernateUtil;  
   
public class UserDao {    
    
public static int register(User u){    
 int i=0;    
  
 
 Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t = session.beginTransaction();   
  
i=(Integer)session.save(u);    
  
t.commit();    

session.close();    
    
return i;    
   
 }    
}    

