package achatcollectif.metier;

import java.util.List;

public interface ISelectSujetMetier {
	
	public List<?> selectSujet(long id_utilisateurs);
	public List<?> selectallSujetMetier();
	public List<?> selectCountSujetMetier(long id_sujet);
	public List<?> selectSujetToCountMetier(long id_sujet);
}
