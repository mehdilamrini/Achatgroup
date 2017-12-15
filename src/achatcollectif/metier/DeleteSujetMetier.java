package achatcollectif.metier;

import achatcollectif.dao.DeleteDAO;
import achatcollectif.dao.IDeleteDAO;

public class DeleteSujetMetier implements IDeleteSujetMetier {
	
	
	IDeleteDAO dao = new DeleteDAO();

	public int DelSujetMetier(long id_sujet) {
		return dao.Delete(id_sujet);
	}
	
	 	
	

	

}
