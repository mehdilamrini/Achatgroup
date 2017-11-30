package achatcollectif.dao;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import achatcollectif.model.Utilisateurs;


public class InsertDAO {
	
	private static SessionFactory factory;
	
	private static void addAllConfigs() {
		Configuration config = new Configuration();
		config = config.configure("persistence.cfg.xml");
		factory = config.buildSessionFactory();

	}
	
	
	
		
		
		public Boolean createAccount(String nom,String prenom,String password,String email , Date date_naissance) {
			
		addAllConfigs();
		Session session = factory.openSession();
		
		

		Transaction tx = null;
		boolean success = false;
		
		try {
			
			
			
			tx = session.beginTransaction();
			
			Utilisateurs user = new Utilisateurs();
			
			//user.setAdmin(1);
			user.setDate(date_naissance);
			user.setNom(nom);
			user.setPrenom(prenom);
			user.setEmail(email);
			user.setPassword(password);
		
			
			session.save(user);
			tx.commit();
			session.close();
			
			 success = true;
			
			
			
			
		}
		
		catch (Exception e) {
			
			
				tx.rollback();
	            e.printStackTrace();
	            success = false;

			
		

		}
		
		
		factory.close();
		return success;
		

		
		
		
		}
}

