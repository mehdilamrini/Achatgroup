package achatcollectif.metier;

import java.util.Date;

public interface ICreateAccountMetier {
	
	public Boolean CreateAccountM(String nom,String prenom,String password,String email , Date date);

}
