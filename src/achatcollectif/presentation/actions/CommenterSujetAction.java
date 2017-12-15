package achatcollectif.presentation.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.CommenterSujetMetier;
import achatcollectif.metier.ICommenterSujetMetier;
import achatcollectif.model.Commentaires;

public class CommenterSujetAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	ICommenterSujetMetier metier ;
	
	
	Commentaires com;
	
	
	private Boolean result;
	public long selectedItem;
	
	
	
	
	public String Commenter() {


		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		long id_utilisateurs = (long) session.getAttribute("id_utilisateurs");


		
		
		System.out.println("id_sujet choisi  "+ com.getId_sujet() );

		System.out.println("commentaires "+ com.getCommentaire());



		metier = new CommenterSujetMetier();
		result = metier.CommenterSujetM(id_utilisateurs, com.getId_sujet() , com.getCommentaire());






		if (result == true )

			return Action.SUCCESS;

		else return Action.ERROR;

	}



	public Commentaires getCom() {
		return com;
	}



	public void setCom(Commentaires com) {
		this.com = com;
	}

	
	
	
	
	

}
