package achatcollectif.presentation.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.ILoginMetier;
import achatcollectif.metier.LoginMetier;
import achatcollectif.model.Utilisateurs;

public class LoginAction extends ActionSupport  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ILoginMetier metier;
	private Utilisateurs userBean;
	private static long result;
	
	public String login() {
		
		
		


			metier = new LoginMetier ();
			
			
			
	         result =metier.LoginUtilisateur(userBean.getEmail(), userBean.getPassword());
	         
	         
	        
	         
	        if (result!=0)
			
			return Action.SUCCESS;
	        else 
	        	return Action.ERROR;
	        	
	        	
		
	}
	
	
	public static long getID() {
		
		
		return result;
		
	}

	 public Utilisateurs getUserBean() {
	        return userBean;
	    }
	 
	    public void setUserBean(Utilisateurs userBean) {
	        this.userBean = userBean;
	    }
	

}
