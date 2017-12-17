package achatcollectif.dao;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import achatcollectif.model.Commentaires;
import achatcollectif.model.Sujet;
import achatcollectif.model.Sujet_adherant;
import achatcollectif.model.Utilisateurs;


public class InsertDAO implements IInsertDAO {

	private static SessionFactory factory;


	private static void addAllConfigs() {
		Configuration config = new Configuration();
		config = config.configure("persistence.cfg.xml");
		factory = config.buildSessionFactory();

	}





	public Boolean createAccount(String nom,String prenom,String password,String email , Date date) {

		addAllConfigs();
		Session session = factory.openSession();

		//System.out.println("DAO :" +nom +"  "+prenom +" "+email+ " "+password +" " +date);


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
			user.setDate_naissance(date);;


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
			double  prix_final, Date date_expiration, String description, String rubrique , int nb_utilisateurs, String image ) {

		addAllConfigs();
		Session session = factory.openSession();

		//System.out.println("DAO :" +id_utilisateurs+"  "+titre +" "+prix_initial+ " "+prix_final +" " +date_expiration

		//		+description+" "+rubrique)  ;



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
			s.setNb_utilisateurs(nb_utilisateurs);
			s.setImage(image);

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



	public Boolean AdhererSujet(long id_utilisateurs , long id_sujet) {

		addAllConfigs();
		Session session = factory.openSession();

		//System.out.println("DAO :" +nom +"  "+prenom +" "+email+ " "+password +" " +date);


		Transaction tx = null;
		boolean success = false;


		try {



			tx = session.beginTransaction();

			Sujet_adherant sujet = new Sujet_adherant();

			//user.setAdmin(1);

			sujet.setId_sujet(id_sujet);
			sujet.setId_utilisateurs(id_utilisateurs);




			session.save(sujet);
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


	public Boolean CommenterSujet(long id_utilisateurs , long id_sujet , String commentaire) {

		addAllConfigs();
		Session session = factory.openSession();
		Transaction tx = null;
		boolean success = false;


		try {



			tx = session.beginTransaction();

			Commentaires com = new Commentaires();
			com.setId_sujet(id_sujet);
			com.setId_utilisateurs(id_utilisateurs);
			com.setCommentaire(commentaire);



			session.save(com);
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

