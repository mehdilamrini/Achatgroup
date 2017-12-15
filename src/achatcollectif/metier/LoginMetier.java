package achatcollectif.metier;

import java.util.List;

import achatcollectif.dao.ISelectDAO;
import achatcollectif.dao.SelectDAO;

public class LoginMetier implements ILoginMetier {
	
	
	
	ISelectDAO dao = new SelectDAO();
	
			public List<?> LoginUtilisateur(String email , String password)
			{
				
				return dao.selectEmailPass(email,password);
				
			}
			
			
	

}
