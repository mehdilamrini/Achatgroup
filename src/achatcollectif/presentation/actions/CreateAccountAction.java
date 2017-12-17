package achatcollectif.presentation.actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.internet.InternetAddress;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.CreateAccountMetier;
import achatcollectif.metier.ICreateAccountMetier;
import achatcollectif.model.Utilisateurs;

public class CreateAccountAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	

	ICreateAccountMetier metier;

	private Utilisateurs userBean;

	public Utilisateurs getUserBean() {
		return userBean;
	}

	public void setUserBean(Utilisateurs userBean) {
		this.userBean = userBean;
	}


	/*public static Date StringToDate(String dt) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date parseDate = sdf.parse(dt);

		return parseDate;


	}
	 */



	public String CreateAccount() throws ParseException {

		metier = new CreateAccountMetier();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parseDate = sdf.parse(userBean.getDt());


		Boolean result = metier.CreateAccountM(userBean.getNom(), userBean.getPrenom(),
				userBean.getPassword(), userBean.getEmail() ,parseDate);
		

		if (result == true) 
			return Action.SUCCESS;
		else 
			return Action.ERROR;

	}





}
