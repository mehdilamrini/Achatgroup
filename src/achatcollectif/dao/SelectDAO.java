package achatcollectif.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import achatcollectif.model.Utilisateurs;



public class SelectDAO implements ISelectDAO {

	private static SessionFactory factory;
	
	private static List<?> utilisateurs;
	public long result;
	
	
	


	private static void addAllConfigs() {
		Configuration config = new Configuration();
		config = config.configure("persistence.cfg.xml");
		factory = config.buildSessionFactory();



	}

	
	public long selectEmailPass(String email,String password) {

		addAllConfigs();

		Session session = factory.openSession();

		
			Query query = session.createQuery("from Utilisateurs where email=:emailparam and password=:passparam ");
			query.setString("emailparam",email);
			query.setString("passparam",password);
			
			

			 utilisateurs = query.list();

			 if (utilisateurs.isEmpty())
				 
				result=0;
				 
				 else 
					 
					{
				 
			 
			for (int i=0 ; i< utilisateurs.size(); i++) {

				Utilisateurs c = (Utilisateurs) utilisateurs.get(i);
				
				
				
				 result = c.getId_utilisateurs();
				
				 
				/*System.out.println("id from db :"+ id);

				System.out.println("Email:"+ c.getEmail());
				System.out.println("Password :"+ c.getPassword());*/



			} }


		session.close();
		factory.close();
		return result;
	}





	/*	private void DeleteCommand(String code) {

		Session session = factory.openSession();
        session.beginTransaction();


		try {


			Query q = session.createQuery("delete Commande d where d.code='A4' " );

			//q.executeUpdate();

			int result = q.executeUpdate();


			System.out.println(result);

			 session.getTransaction().commit(); 
		}	

		finally {
			session.close();
		}


		factory.close();


	}


	private void selectCommand(String code) {

		Session session = factory.openSession();

		try {


			Query query = session.createQuery("from Commande where code=:codeparam ");
			query.setString("codeparam",code);

			List commandes = query.list();

			for (int i=0 ; i< commandes.size(); i++) {

				Commande c = (Commande) commandes.get(i);
				System.out.println("Nom:"+ c.getLibelle());
				System.out.println("Prenom:"+ c.getMontant());


			} 




		}	

		finally {session.close();
		}

		factory.close();
	}

	private void insertCommande(String code,String libelle, String montant) {
		Session session = factory.openSession();
		Transaction tx = null;



		try {

			tx = session.beginTransaction();
			Commande c1= new Commande();
			c1.setCode(code);
			c1.setLibelle(libelle);
			c1.setMontant(montant);
			session.save(c1);

			tx.commit();

		}	catch (HibernateException ex) {


			if (tx != null)
				tx.rollback();

		}  finally {session.close();
		}



	}
	 */
}

