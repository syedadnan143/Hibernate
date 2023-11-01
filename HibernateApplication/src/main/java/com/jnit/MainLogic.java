package com.jnit;

import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;
 
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SessionFactory sf = hibernateutil.getSessionFactory();
        Session se=sf.openSession();
//        Transaction tx=se.beginTransaction();
//        Query qr=se.createQuery("from students s where s.id in(:x)");
//        qr.setParameter("x", 1);
//        qr.setParameter("y",1012);
        Query qr=se.createQuery("select s.student_id, s.first_name, s.last_name,s.email  from students s");
        List li = qr.list();
        Iterator i=li.iterator();
        
        while(i.hasNext()){ 
        Object[] s = (Object[])i.next();
//        	 System.out.println(s.getStudent_id()+" "+s.getFirst_name()+" "+s.getLast_name()+s.getEmail()+" " +s.getDate_of_birth());
        
        System.out.println(s[0]+" " +s[1]+" "+s[2]+" "+s[3]);
        }
       
//        students s = se.get(students.class,1011);
//        s.setLast_name("chris");
//        se.update(s);
       
//        s.setStudent_id(1013);
//        s.setFirst_name("abigail");
//        s.setLast_name("mr");
//        s.setDate_of_birth(2014-12-13);
//        s.setEmail("jd12@gmail.com");
//        se.save(s);
//        tx.commit();
	}
		
	}

