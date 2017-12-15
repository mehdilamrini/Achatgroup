package achatcollectif.dao;

import java.util.List;

public interface ISelectDAO {

	

	public List<?> selectEmailPass(String email, String password);
	public List<?> selectSujet(long id_utilisateurs);
	public List<?> selectAllSujet();
	
	
	// pour le traitement des 
	public List<?> selectSujetToCount(long id_sujet);
	public List<?> selectCountSujet(long id_sujet);
	
	
	
}
