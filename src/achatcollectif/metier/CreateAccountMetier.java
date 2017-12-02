package achatcollectif.metier;

import java.util.Date;

import achatcollectif.dao.*;


public class CreateAccountMetier implements ICreateAccountMetier {
	
	InsertDAO dao = new InsertDAO();
	
	public Boolean CreateAccountM(String nom,String prenom,String password,String email, Date date ) {
		
		
		return dao.createAccount(nom, prenom, password,email,date);
		
	}
	

}
