package achatcollectif.metier;

import achatcollectif.dao.IInsertDAO;
import achatcollectif.dao.InsertDAO;

public class AdhererSujetMetier implements  IAdhererSujetMetier {


	IInsertDAO dao = new InsertDAO();
	
	public Boolean AdhererSujetM(long id_utilisateurs , long id_sujet) {
		
		
		return dao.AdhererSujet(id_utilisateurs, id_sujet);
		
	}
	
	

	
	
	


}
