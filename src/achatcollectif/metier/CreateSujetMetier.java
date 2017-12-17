package achatcollectif.metier;

import java.util.Date;

import achatcollectif.dao.InsertDAO;

public class CreateSujetMetier implements ICreateSujetMetier {
	InsertDAO dao = new InsertDAO();

	
	
	public Boolean CreateSujetM(long id_utilisateurs, String titre,double  prix_initial,
			double  prix_final, Date date_expiration, String description, String rubrique , int nb_utilisateurs , String image)
	
	{
		
		return dao.createSujet(id_utilisateurs, titre, prix_initial, prix_final, date_expiration, description, rubrique , nb_utilisateurs,image);
		
	}
	

}
