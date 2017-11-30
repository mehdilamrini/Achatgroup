package achatcollectif.metier;

import java.util.Date;

public interface ICreateAccountMetier {
	
	public Boolean CreateAccountMetier(String nom,String prenom,String password,String email , Date date_naissance);

}
