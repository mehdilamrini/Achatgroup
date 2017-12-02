package achatcollectif.dao;

import java.util.Date;

public interface IInsertDAO {
	
	public Boolean createAccount(String nom,String prenom,String password,String email, Date date );
	public Boolean createSujet(long id_utilisateurs, String titre,double  prix_initial,double  prix_final, 
			Date date_expiration, String description, String rubrique);

}
