package achatcollectif.presentation.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.IUpdateProfilMetier;
import achatcollectif.model.Utilisateurs;

public class UpdateProfilAction extends ActionSupport {


	private static final long serialVersionUID = 1L;
	IUpdateProfilMetier metier;
	private Utilisateurs userBean;
	long id_utilisateurs;



	int result=0;


	public String updateprofil() {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		id_utilisateurs = (long) session.getAttribute("id_utilisateurs");



		System.out.println(userBean.getNom());
		System.out.println(userBean.getPrenom());
		System.out.println(userBean.getDate());
		System.out.println(userBean.getEmail());

		result= metier.UpdateProfilM(id_utilisateurs, userBean.getNom(), userBean.getPrenom(), userBean.getDate(), userBean.getEmail());

		if (result !=0 )

			return Action.SUCCESS;

		else return Action.ERROR;

	}



	public Utilisateurs getUserBean() {
		return userBean;
	}




	public void setUserBean(Utilisateurs userBean) {
		this.userBean = userBean;
	}







}
