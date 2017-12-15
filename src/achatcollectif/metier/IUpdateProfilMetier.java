package achatcollectif.metier;

import java.util.Date;

public interface IUpdateProfilMetier {
	
	
	public int UpdateProfilM(long id_utilisateurs,String nom, String prenom, Date date_naissance,String email );

}
