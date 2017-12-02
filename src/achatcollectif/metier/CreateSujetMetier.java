package achatcollectif.metier;

import java.util.Date;

import achatcollectif.dao.ISelectDAO;
import achatcollectif.dao.InsertDAO;
import achatcollectif.dao.SelectDAO;

public class CreateSujetMetier implements ICreateSujetMetier {
	InsertDAO dao = new InsertDAO();
	ISelectDAO dao2 = new SelectDAO();

	
	
	public Boolean CreateSujetM(long id_utilisateurs, String titre,double  prix_initial,
			double  prix_final, Date date_expiration, String description, String rubrique)
	
	{
		
		return dao.createSujet(id_utilisateurs, titre, prix_initial, prix_final, date_expiration, description, rubrique);
		
	}
	
	
	/*public long idMetier(String email , String password) {
		return dao2.id(email, password);
	}*/
	
	
}
