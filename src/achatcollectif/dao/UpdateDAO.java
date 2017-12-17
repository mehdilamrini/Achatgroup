package achatcollectif.dao;

import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateDAO implements IUpdateDAO {



	private static SessionFactory factory;
	//List<?> p;


	private static void addAllConfigs() {
		Configuration config = new Configuration();
		config = config.configure("persistence.cfg.xml");
		factory = config.buildSessionFactory();

	}

	public int UpdateProfil(long id_utilisateurs,String nom, String prenom, Date date_naissance,String email ) {


		addAllConfigs();
		Session session = factory.openSession();
		session.beginTransaction();


		Query qry = session.createQuery("update Utilisateurs p set p.nom=:nomparam , p.prenom=:prenomparam , p.email=:emailparam , p.date_naissance=:dateparam where p.id_utilisateurs=:iduser");

		qry.setLong("iduser", id_utilisateurs);
		qry.setString("nomparam",nom);
		qry.setString("prenomparam", prenom);
		qry.setDate("dateparam", date_naissance)	;
		qry.setString("emailparam", email);

		int res = qry.executeUpdate();
		System.out.println(" resultat update profil:" +res);
		//p = qry.list();
		session.getTransaction().commit(); 


		session.close();
		factory.close();
		return res;


	}
	
	
	
	public int UpdateDeal(long id_sujet,int validation ) {


		addAllConfigs();
		Session session = factory.openSession();
		session.beginTransaction();


		Query qry = session.createQuery("update Sujet s set s.validation=:validparam where s.id_sujet=:idsujet");

		qry.setLong("idsujet", id_sujet);
		qry.setInteger("validparam", validation);


		int res = qry.executeUpdate();
		System.out.println(" resultat update deal:" +res);
		//p = qry.list();
		session.getTransaction().commit(); 


		session.close();
		factory.close();
		return res;


	}
	
	
	
	

}
