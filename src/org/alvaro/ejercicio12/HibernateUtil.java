package org.alvaro.ejercicio12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static Session getSession(){
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		
		Session sesion = sf.openSession();
		
		return sesion;
		
		
	}

}
