package achatcollectif.metier;

import achatcollectif.dao.IInsertDAO;
import achatcollectif.dao.InsertDAO;

public class CommenterSujetMetier implements ICommenterSujetMetier {

	
	IInsertDAO dao = new InsertDAO();
	
	
	public Boolean CommenterSujetM (long id_utilisateurs ,long id_sujet, String commentaire)  {
		
		return dao.CommenterSujet(id_utilisateurs, id_sujet, commentaire);
		
	}
	
	
}
