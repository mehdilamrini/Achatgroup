package achatcollectif.dao;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import achatcollectif.model.Sujet;
import achatcollectif.model.Utilisateurs;


public class InsertDAO {

	private static SessionFactory factory;


	private static void addAllConfigs() {
		Configuration config = new Configuration();
		config = config.configure("persistence.cfg.xml");
		factory = config.buildSessionFactory();

	}





	public Boolean createAccount(String nom,String prenom,String password,String email , Date date) {

		addAllConfigs();
		Session session = factory.openSession();

		System.out.println("DAO :" +nom +"  "+prenom +" "+email+ " "+password +" " +date);


		Transaction tx = null;
		boolean success = false;


		try {



			tx = session.beginTransaction();

			Utilisateurs user = new Utilisateurs();

			//user.setAdmin(1);


			user.setNom(nom);
			user.setPrenom(prenom);
			user.setEmail(email);
			user.setPassword(password);
			user.setDate(date);


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





	public Boolean createSujet(long id_utilisateurs, String titre,double  prix_initial,
			double  prix_final, Date date_expiration, String description, String rubrique) {

		addAllConfigs();
		Session session = factory.openSession();

		System.out.println("DAO :" +id_utilisateurs+"  "+titre +" "+prix_initial+ " "+prix_final +" " +date_expiration

				+description+" "+rubrique);



		Transaction tx = null;
		boolean success = false;


		try {



			tx = session.beginTransaction();

			Sujet s = new Sujet();

			//user.setAdmin(1);


			s.setTitre(titre);
			s.setId_utilisateurs(id_utilisateurs);
			s.setPrix_initial(prix_initial);
			s.setPrix_final(prix_final);
			s.setRubrique(rubrique);
			s.setDate_expiration(date_expiration);
			s.setDescription(description);

			session.save(s);
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

