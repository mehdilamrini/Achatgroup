package achatcollectif.presentation.actions;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.ILoginMetier;
import achatcollectif.metier.LoginMetier;
import achatcollectif.model.Utilisateurs;

import org.apache.struts2.interceptor.SessionAware;

public class LoginAction extends ActionSupport implements SessionAware
{


	private static final long serialVersionUID = 1L;


	private Map<String, Object> session;


	ILoginMetier metier;
	private Utilisateurs userBean;

	private static long result;
	private static String nom;
	private static String prenom;
	private static String email;
	private static Date date_naissance;
	private static int admin;




	public List<?> resultquerylogin;

	public String logout() {

		session.clear();

		return Action.SUCCESS;
	}

	public String login() throws Exception {

		if ( session.containsKey("id_utilisateurs")  ) {

			return Action.SUCCESS;

		}


		else 
		{
			metier = new LoginMetier ();
			resultquerylogin = metier.LoginUtilisateur(userBean.getEmail(), userBean.getPassword());


			if (resultquerylogin.contains(null) ) {
				return Action.ERROR;

			}



			else 
			{


				for (int i=0 ; i< resultquerylogin.size(); i++) {

					Utilisateurs c = (Utilisateurs) resultquerylogin.get(i);

					result = c.getId_utilisateurs();
					session.put("id_utilisateurs", result);
					


					nom = c.getNom();
					session.put("nom", nom);
					
					
					prenom = c.getPrenom();
					session.put("prenom", prenom);
					date_naissance = c.getDate_naissance();
					session.put("date_naissance", date_naissance);

					email = c.getEmail();
					session.put("email", email);

					admin = c.getAdmin();
					session.put("admin", admin);




				}

				return Action.SUCCESS;

			}}	
	}


	public long getID() {
		return result;

	}


	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public int getAdmin() {
		return admin;
	}

	public Utilisateurs getUserBean() {
		return userBean;
	}

	public void setUserBean(Utilisateurs userBean) {
		this.userBean = userBean;
	}




	@Override
	public void setSession(Map session) {
		this.session=session;

	}







}