package achatcollectif.presentation.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.CreateAccountMetier;
import achatcollectif.metier.ICreateAccountMetier;
import achatcollectif.model.Utilisateurs;

public class CreateAccountAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ICreateAccountMetier metier;
	
	private Utilisateurs userBean;
	

	public Utilisateurs getUserBean() {
		return userBean;
	}

	public void setUserBean(Utilisateurs userBean) {
		this.userBean = userBean;
	}
	
	
	

	public String CreateAccount() {
		
		metier = new CreateAccountMetier();
		
		Boolean result = metier.CreateAccountMetier(userBean.getNom(), userBean.getPrenom(),
				userBean.getPassword(), userBean.getEmail(), userBean.getDate());

		if (result == true) 
			return Action.SUCCESS;
        else 
        	return Action.ERROR;
		
	}
	
	
	
	

}
