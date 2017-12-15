package achatcollectif.dao;

import java.util.Date;

public interface IInsertDAO {

	public Boolean createAccount(String nom,String prenom,String password,String email, Date date );
	public Boolean createSujet(long id_utilisateurs, String titre,double  prix_initial,double  prix_final, 
			Date date_expiration, String description, String rubrique, int nb_utilisateurs);
	public Boolean AdhererSujet(long id_utilisateurs , long id_sujet);
	public Boolean CommenterSujet(long id_utilisateurs , long id_sujet , String commentaire);

}
