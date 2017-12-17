package achatcollectif.presentation.actions;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
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
	static long id ;

	private File myFile;
	private String myFileContentType;
	private String myFileFileName;
	private String destPath;

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}




	private static final long serialVersionUID = 1L;
	public long id_utilisateurs;

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

		destPath = "/Users/mac/eclipse-workspace/CouchePresentationAchatCollectif/WebContent/ImageUploaded/";
		
		metier = new CreateSujetMetier();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		id_utilisateurs = (long) session.getAttribute("id_utilisateurs");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parseDate = sdf.parse(sujetBean.getDt());


		String err = null;

		try {

			File destFile  = new File(destPath, myFileFileName);
			FileUtils.copyFile(myFile, destFile);

		} catch(IOException e) {

			e.printStackTrace();
			err="error";
		}



		Boolean result = metier.CreateSujetM(id_utilisateurs,
				sujetBean.getTitre(), sujetBean.getPrix_initial(), sujetBean.getPrix_final(), parseDate, 
				sujetBean.getDescription(), sujetBean.getRubrique(),sujetBean.getNb_utilisateurs() , "test" );

		if (result == true && err != "error") 
			return Action.SUCCESS;
		else 
			return Action.ERROR;

	}




}
