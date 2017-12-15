package achatcollectif.presentation.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.DeleteSujetMetier;
import achatcollectif.metier.IDeleteSujetMetier;

public class DeleteSujetAction extends ActionSupport {


	private static final long serialVersionUID = 1L;
	IDeleteSujetMetier metier ;
	private int result=0 ;
	public long selectedItem;






	public String Del() {



		HttpServletRequest request = ServletActionContext.getRequest();

		if(request.getParameter("id_sujet")!=null)
		{
			selectedItem=Long.parseLong( request.getParameter("id_sujet") );
		}
		System.out.println("id selectionné"+selectedItem);



		metier = new DeleteSujetMetier();
		result = metier.DelSujetMetier(selectedItem);  	 



		if (result !=0 )

			return Action.SUCCESS;

		else return Action.ERROR;

	}






}
