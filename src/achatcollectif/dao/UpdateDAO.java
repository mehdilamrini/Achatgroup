package achatcollectif.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateDAO implements IUpdateDAO {
	
	
	
	private static SessionFactory factory;
	List<?> p;


	private static void addAllConfigs() {
		Configuration config = new Configuration();
		config = config.configure("persistence.cfg.xml");
		factory = config.buildSessionFactory();

	}
	
	
	
	
	
	
	
	
	public int UpdateProfil(long id_utilisateurs,String nom, String prenom, Date date_naissance,String email ) {
		
		
		addAllConfigs();
		Session session = factory.openSession();
		
		Query qry = session.createQuery("update Utilisateurs p set p.nom=:nomparam and p.prenom=:prenomparam and p.email=:emailparam and p.date_naissance=:dateparam where p.id_utilisateurs=:iduser");
	
		qry.setString("nomparam",nom);
		qry.setString("prenomparam", prenom);
		qry.setDate("dateparam", date_naissance)	;
		qry.setString("emailparam", email);
		
					        int res = qry.executeUpdate();
		
					        p = qry.list();
					        
					        factory.close();
							return res;
		
		
	}

}
