package com.jnit;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class hibernateutil {
  public static SessionFactory sessionFactory;
  public static SessionFactory getSessionFactory() {
	  Configuration cf = new Configuration();
	  Properties pr = new Properties();
	  pr.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	  pr.put(Environment.URL, "jdbc:mysql://localhost:3306/user");
	  pr.put(Environment.USER, "root");
	  pr.put(Environment.PASS,"aA123456");
	  
	  pr.put(Environment.SHOW_SQL, "TRUE");
	  pr.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
	  pr.put(Environment.HBM2DDL_AUTO, "update");
	  cf.setProperties(pr);
	 cf.addAnnotatedClass(students.class);
	 sessionFactory=cf.buildSessionFactory();
	  return sessionFactory;
	  
	  
	  
	  
  }
  
  
}
