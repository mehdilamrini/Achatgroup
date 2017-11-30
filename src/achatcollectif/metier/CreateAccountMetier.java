package achatcollectif.metier;
import java.util.Date;

import achatcollectif.dao.*;


public class CreateAccountMetier implements ICreateAccountMetier {
	
	InsertDAO dao = new InsertDAO();
	
	public Boolean CreateAccountMetier(String nom,String prenom,String password,String email , Date date_naissance) {
		
		
		return dao.createAccount(nom, prenom, password, email, date_naissance);
		
	}
	

}
