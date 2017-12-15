package achatcollectif.presentation.actions;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import achatcollectif.metier.ISelectSujetMetier;
import achatcollectif.metier.SelectSujetMetier;
import achatcollectif.model.Sujet;

public class SelectSujetAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	ISelectSujetMetier metier;
	private List<?> results ;
	private List<?> results2;
	List<?> list_nombre_adh;
	List<Sujet> arr=null ;
	private int nb_adh;
	private String valid;

	public long id_utilisateurs;

	public String sujet() {


		arr = new ArrayList<Sujet>();

		//LoginAction a = new LoginAction();

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		id_utilisateurs = (long) session.getAttribute("id_utilisateurs");



		metier = new SelectSujetMetier ();
		results = metier.selectSujet(id_utilisateurs);


		if (results.contains(null))

			return Action.ERROR;

		else 


		{    

			for (int i=0 ; i< results.size(); i++) {



				Sujet c = (Sujet) results.get(i);
				arr.add(c);

				System.out.println("Sujet    :"+c);



			}

			return Action.SUCCESS;
		}

	}



	public String Allsujet() {


		arr = new ArrayList<Sujet>();

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		id_utilisateurs = (long) session.getAttribute("id_utilisateurs");



		metier = new SelectSujetMetier ();
		results = metier.selectallSujetMetier();


		if (results.contains(null))

			return Action.ERROR;

		else 


		{    

			for (int i=0 ; i< results.size(); i++) {



				Sujet c = (Sujet) results.get(i);
				arr.add(c);

				System.out.println("Sujet    :"+c);



			}

			return Action.SUCCESS;
		}

	}



	public String sujettocount() {


		arr = new ArrayList<Sujet>();
		HttpServletRequest request = ServletActionContext.getRequest();
		long id_sujet = Long.parseLong( request.getParameter("id_sujet"));

		metier = new SelectSujetMetier ();
		results = metier.selectSujetToCountMetier(id_sujet);
		results2 = metier.selectCountSujetMetier(id_sujet);
		
		 nb_adh   = results2.size();
		
		System.out.println("nombre d'adherent :" +nb_adh);
		
		
	//	request.setAttribute("nb_adh",String.valueOf(nb_adh) );

		//request.setAttribute("nb_adh",nb_adh );

		if (results.contains(null))

			return Action.ERROR;

		else 


		{    

			for (int i=0 ; i< results.size(); i++) {

				Sujet c = (Sujet) results.get(i);
				int restant = (c.getNb_utilisateurs()) - nb_adh;
				
				if ( restant == 0 )
				
			
					
					valid= "Deal Validé" ;
			
				
				else {
					
					
					
					valid= "Deal en cours ,nombre d'adhérant restant "+restant ;
				}
				arr.add(c);
				
				//System.out.println("Sujet    :"+c);



			}

			return Action.SUCCESS;
		}

	}











	public List<?> getNombre_adh() {
		return list_nombre_adh;
	}



	public void setNombre_adh(List<?> list_nombre_adh) {
		this.list_nombre_adh = list_nombre_adh;
	}



	public List<Sujet> getArr() {
		return arr;
	}


	public void setArr(List<Sujet> arr) {
		this.arr = arr;
	}



	public int getNb_adh() {
		return nb_adh;
	}



	public void setNb_adh(int nb_adh) {
		this.nb_adh = nb_adh;
	}



	public String getValid() {
		return valid;
	}



	public void setValid(String valid) {
		this.valid = valid;
	}





















}
