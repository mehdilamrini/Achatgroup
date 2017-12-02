package achatcollectif.presentation.actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.CreateSujetMetier;
import achatcollectif.metier.ICreateSujetMetier;
import achatcollectif.model.Sujet;
import achatcollectif.model.Utilisateurs;

public class CreateSujetAction extends ActionSupport {
	
	ICreateSujetMetier metier;
	private Sujet sujetBean;
	private Utilisateurs userBean;
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Utilisateurs getUserBean() {
		return userBean;
	}

	public void setUserBean(Utilisateurs userBean) {
		this.userBean = userBean;
	}

	public Sujet getSujetBean() {
		return sujetBean;
	}

	public void setSujetBean(Sujet sujetBean) {
		this.sujetBean = sujetBean;
	}
	
	
public String CreateSujet() throws ParseException {
		
		metier = new CreateSujetMetier();
		
		
		
		long id = LoginAction.getID();
		
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date parseDate = sdf.parse(sujetBean.getDt());
		
		
		
		//long i= metier.idMetier("mehdi.lamr@gmail.com", "123456");
		
		//System.out.println("id static:" +i );
		
		Boolean result = metier.CreateSujetM(id,
				
				sujetBean.getTitre(), sujetBean.getPrix_initial(), sujetBean.getPrix_final(), parseDate, 
				sujetBean.getDescription(), sujetBean.getRubrique());

		if (result == true) 
			return Action.SUCCESS;
        else 
        		return Action.ERROR;
		
	}
	
	
	

}
