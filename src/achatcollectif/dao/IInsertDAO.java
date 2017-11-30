package achatcollectif.dao;

import java.util.Date;

public interface IInsertDAO {
	
	public Boolean createAccount(String nom,String prenom,String password,String email , Date date_naissance);

}
