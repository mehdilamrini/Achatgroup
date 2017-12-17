package achatcollectif.presentation.actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.IUpdateProfilMetier;
import achatcollectif.metier.UpdateProfilMetier;
import achatcollectif.model.Utilisateurs;

public class UpdateProfilAction extends ActionSupport {


	private static final long serialVersionUID = 1L;
	IUpdateProfilMetier metier;
	private Utilisateurs userBean;


	public Utilisateurs getUserBean() {
		return userBean;
	}

	public void setUserBean(Utilisateurs userBean) {
		this.userBean = userBean;
	}
	
	long id_utilisateurs;



	int result=0;


	public String updateprofil() throws ParseException {
		
		metier = new UpdateProfilMetier();

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		id_utilisateurs = (long) session.getAttribute("id_utilisateurs");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date parseDate = sdf.parse(userBean.getDt());

		
		
		System.out.println(id_utilisateurs);
	/*	System.out.println(userBean.getNom());
		System.out.println(userBean.getPrenom());
		System.out.println(userBean.getDt());
		System.out.println(userBean.getEmail());*/
		
		
		if ( session.getAttribute("nom") != userBean.getNom() || session.getAttribute("prenom") != userBean.getPrenom() ||
				session.getAttribute("date_naissance") != userBean.getDt() || session.getAttribute("email") != userBean.getEmail()) {
			
			
			session.setAttribute("nom", userBean.getNom());
			session.setAttribute("prenom", userBean.getPrenom());
			session.setAttribute("date_naissance", userBean.getDt());
			session.setAttribute("email", userBean.getEmail());
			
			
		}
		
		

		result = metier.UpdateProfilM(id_utilisateurs, userBean.getNom(), userBean.getPrenom(), parseDate, userBean.getEmail());

		if (result !=0 )

			return Action.SUCCESS;

		else return Action.ERROR;

	}










}
