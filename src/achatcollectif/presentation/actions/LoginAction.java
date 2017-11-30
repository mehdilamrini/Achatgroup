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
	
	public String login() {
		
		
		


			metier = new LoginMetier ();
			
			//System.out.println("Appel au service ajout de la partie metier");
			//System.out.println("email: " + userBean.getEmail());
	        //System.out.println("pass: " + userBean.getPassword());
			
	         String result =metier.LoginUtilisateur(userBean.getEmail(), userBean.getPassword());
	        
	        
	        if (result=="1")
			
			return Action.SUCCESS;
	        else 
	        	return Action.ERROR;
	        	
	        	
		
	}
	
	
	

	 public Utilisateurs getUserBean() {
	        return userBean;
	    }
	 
	    public void setUserBean(Utilisateurs userBean) {
	        this.userBean = userBean;
	    }
	

}
