package achatcollectif.metier;

import java.util.Date;

import achatcollectif.dao.IUpdateDAO;
import achatcollectif.dao.UpdateDAO;

public class UpdateProfilMetier implements IUpdateProfilMetier  {
	
	IUpdateDAO dao = new UpdateDAO();
	
	public int UpdateProfilM(long id_utilisateurs,String nom, String prenom, Date date_naissance,String email ) {
		
		return dao.UpdateProfil(id_utilisateurs, nom, prenom, date_naissance, email);
		
		
	}


	

}
