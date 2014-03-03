package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionException;

import util.HibernateUtil;


public class Hibernate {	
	
	
	public static Object dameObjeto(String id){
		return null;		
	}
	
	public static int guardarObjeto(Object objeto){
		int status=0;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			
		session.beginTransaction();
		
		session.save(objeto);
				
		session.getTransaction().commit();
		status=1;
		System.out.println("Guardado ok");
		}catch(SessionException e){
			System.out.println("Error desde consola "+e.getMessage());
		session.getTransaction().rollback();	
		status=0;
			
		}
		return status;
		
	}
	public static int modificarObjeto(Object objeto){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			
		session.beginTransaction();
		
		session.update(objeto);
				
		session.getTransaction().commit();
		}catch(Exception e){
		session.getTransaction().rollback();	
			
		}
		return 0;
		
	}
	public static int borrarObjeto(Object objeto){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			
		session.beginTransaction();
		
		session.delete(objeto);
				
		session.getTransaction().commit();
		}catch(Exception e){
		session.getTransaction().rollback();	
			
		}
		return 0;
		
	}
	
	

}
