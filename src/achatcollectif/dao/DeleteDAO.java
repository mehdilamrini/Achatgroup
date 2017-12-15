package achatcollectif.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDAO implements IDeleteDAO {


	private static SessionFactory factory;
	public  List<?> produits;
	public int result=0;


	private static void addAllConfigs() {

		Configuration config = new Configuration();
		config = config.configure("persistence.cfg.xml");
		factory = config.buildSessionFactory();

	}




	public int Delete(long id_sujet) {


		addAllConfigs();
		Session session = factory.openSession();
		session.beginTransaction();

		Query q = session.createQuery("delete Sujet s where s.id_sujet=:idparam " );
		q.setLong("idparam",id_sujet);
		//q.executeUpdate();
		int result = q.executeUpdate();
		System.out.println("LE resultat du delete:"+result);
		session.getTransaction().commit(); 
		session.close();
		factory.close();
		return result;


	}





}
