package achatcollectif.metier;

import java.util.Date;

public interface ICreateSujetMetier {
	
	public Boolean CreateSujetM(long id_utilisateurs, String titre,double  prix_initial,
			double  prix_final, Date date_expiration, String description, String rubrique , int nb_utilisateurs);
	
	//public long idMetier(String email , String password);

}
