package achatcollectif.metier;

import achatcollectif.dao.ISelectDAO;
import achatcollectif.dao.SelectDAO;

public class LoginMetier implements ILoginMetier {
	
	
	
	ISelectDAO dao = new SelectDAO();
	
			public long LoginUtilisateur(String email , String password)
			{
				
				return dao.selectEmailPass(email,password);
				
			}
			
			
	

}
