package achatcollectif.presentation.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.AdhererSujetMetier;
import achatcollectif.metier.IAdhererSujetMetier;

public class AdhererSujetAction extends ActionSupport {



	private static final long serialVersionUID = 1L;

	IAdhererSujetMetier metier ; 

	private Boolean result;
	public long selectedItem;


	public String adherer() {


		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		long id_utilisateurs = (long) session.getAttribute("id_utilisateurs");


		if(request.getParameter("id_sujet")!=null)
		{
			selectedItem=Long.parseLong( request.getParameter("id_sujet") );
		}
		System.out.println("id selectionné"+selectedItem);



		metier = new AdhererSujetMetier();
		result = metier.AdhererSujetM(id_utilisateurs, selectedItem);
		
		
		
		
		






		if (result == true )

			return Action.SUCCESS;

		else return Action.ERROR;

	}






}
