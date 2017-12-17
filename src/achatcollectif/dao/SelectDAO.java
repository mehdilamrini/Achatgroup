package achatcollectif.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import achatcollectif.model.Sujet;




public class SelectDAO implements ISelectDAO {

	private static SessionFactory factory;
	public  List<?> utilisateurs;
	public  List<?> sujets;




	private static void addAllConfigs() {

		Configuration config = new Configuration();
		config = config.configure("persistence.cfg.xml");
		factory = config.buildSessionFactory();

	}


	public List<?> selectEmailPass(String email,String password) {


		addAllConfigs();
		Session session = factory.openSession();



		Query query = session.createQuery("from Utilisateurs where email=:emailparam and password=:passparam ");
		query.setString("emailparam",email);
		query.setString("passparam",password);

		utilisateurs = query.list();

		if (utilisateurs.isEmpty() )
		{		
			utilisateurs.add(null);


		}

		/*	else   
		{

			for (int i=0 ; i< utilisateurs.size(); i++) {

				Utilisateurs c = (Utilisateurs) utilisateurs.get(i);

				System.out.println("nomnom:"+c.getNom());

				//	user = new Utilisateurs(c.getId_utilisateurs(),c.getNom(),c.getPrenom(),c.getEmail(),c.getDate(),c.getAdmin());

				// System.out.println("id from db :"+ id);
				// System.out.println("Email:"+ c.getEmail());
				// System.out.println("Password :"+ c.getPassword());

			} 
		}*/



		session.close();
		factory.close();
		return utilisateurs;


	}


	public List<?> selectSujet(long id_utilisateurs) {


		addAllConfigs();
		Session session = factory.openSession();



		Query query = session.createQuery("from Sujet where id_utilisateurs=:idparam ");
		query.setLong("idparam",id_utilisateurs);


		sujets = query.list();



		for (int i=0 ; i< sujets.size(); i++) {

			Sujet c = (Sujet) sujets.get(i);



			//	user = new Utilisateurs(c.getId_utilisateurs(),c.getNom(),c.getPrenom(),c.getEmail(),c.getDate(),c.getAdmin());

			// System.out.println("id from db :"+ id);
			// System.out.println("Email:"+ c.getEmail());
			// System.out.println("Password :"+ c.getPassword());

		} 







		if (sujets.isEmpty() )
		{		
			sujets.add(null);


		}


		session.close();
		factory.close();
		return sujets;


	}


	public List<?> selectAllSujet() {


		addAllConfigs();
		Session session = factory.openSession();



		Query query = session.createQuery("from Sujet");


		sujets = query.list();

		if (sujets.isEmpty() )
		{		
			sujets.add(null);


		}


		session.close();
		factory.close();
		return sujets;


	}


	public List<?> selectSujetToCount(long id_sujet) {


		addAllConfigs();
		Session session = factory.openSession();



		Query query = session.createQuery("from Sujet where id_sujet=:idparam ");
		query.setLong("idparam",id_sujet);


		sujets = query.list();

		if (sujets.isEmpty() )
		{		
			sujets.add(null);


		}


		session.close();
		factory.close();
		return sujets;


	}





	public List<?> selectCountSujet(long id_sujet) {


		addAllConfigs();
		Session session = factory.openSession();



		Query query = session.createQuery("from Sujet_adherant where id_sujet=:idparam ");
		query.setLong("idparam",id_sujet);


		sujets = query.list();

		if (sujets.isEmpty() )
		{		
			sujets.add(null);


		}


		session.close();
		factory.close();
		return sujets;


	}


	public List<?> selectEmailToNotify(long id_sujet) {


		addAllConfigs();
		Session session = factory.openSession();



		Query query = session.createQuery("from Sujet_adherant where id_sujet=:idparam ");
		query.setLong("idparam",id_sujet);


		sujets = query.list();

		if (sujets.isEmpty() )
		{		
			sujets.add(null);


		}


		session.close();
		factory.close();
		return sujets;


	}






}

