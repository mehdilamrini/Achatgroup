package achatcollectif.metier;

import java.util.List;

import achatcollectif.dao.ISelectDAO;
import achatcollectif.dao.SelectDAO;

public class SelectSujetMetier implements ISelectSujetMetier {

	ISelectDAO dao = new SelectDAO();
	
	
	public List<?> selectSujet(long id_utilisateurs) {
		
		return dao.selectSujet(id_utilisateurs);
		
	}
	
	public List<?> selectallSujetMetier() {

		return dao.selectAllSujet();

	}
	
	// pour la validation des deals
	
	public List<?> selectSujetToCountMetier(long id_sujet) {

		return dao.selectSujetToCount(id_sujet);

	}
	
	
	public List<?> selectCountSujetMetier(long id_sujet) {

		return dao.selectCountSujet(id_sujet);

	}
	
	
	
	
	
	
}
