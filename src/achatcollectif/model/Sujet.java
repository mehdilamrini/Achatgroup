package achatcollectif.model;

import java.util.Date;

public class Sujet {
	
	private long id_sujet;
	private long id_utilisateurs;
	private String titre;
	private double prix_initial;
	private double prix_final;
	private Date date_expiration ;
	private String image;
	private String rubrique;
	private String description ;
	private String dt;
	private int nb_utilisateurs;
	private int validation ;

	
	
	public Sujet(long id_sujet, long id_utilisateurs, String titre, double prix_initial, double prix_final, Date date_expiration,
			String rubrique, String description , int nb_utilisateurs , int validation) {
		super();
		this.id_sujet = id_sujet;
		this.id_utilisateurs = id_utilisateurs;
		this.titre = titre;
		this.prix_initial = prix_initial;
		this.prix_final = prix_final;
		this.date_expiration = date_expiration;
		this.rubrique = rubrique;
		this.description = description;
		this.nb_utilisateurs=nb_utilisateurs;
	}
	
	public Sujet(String titre, double prix_initial, double prix_final, Date date_expiration,
			String rubrique, String description , int nb_utilisateurs,  int validation) {
	
		this.titre = titre;
		this.prix_initial = prix_initial;
		this.prix_final = prix_final;
		this.date_expiration = date_expiration;
		this.rubrique = rubrique;
		this.description = description;
		this.nb_utilisateurs=nb_utilisateurs;
		this.validation=validation;
	}
	


	public Sujet() {
		super();
	}
	
	

	public String getDt() {
		return dt;
	}


	public void setDt(String dt) {
		this.dt = dt;
	}


	public Date getDate_expiration() {
		return date_expiration;
	}


	public void setDate_expiration(Date date_expiration) {
		this.date_expiration = date_expiration;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}

	
	
	
	public long getId_utilisateurs() {
		return id_utilisateurs;
	}


	public void setId_utilisateurs(long id_utilisateurs) {
		this.id_utilisateurs = id_utilisateurs;
	}
	

	public long getId_sujet() {
		return id_sujet;
	}
	public void setId_sujet(long id_sujet) {
		this.id_sujet = id_sujet;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public double getPrix_initial() {
		return prix_initial;
	}
	public void setPrix_initial(double prix_initial) {
		this.prix_initial = prix_initial;
	}
	public double getPrix_final() {
		return prix_final;
	}
	public void setPrix_final(double prix_final) {
		this.prix_final = prix_final;
	}
	
	public String getRubrique() {
		return rubrique;
	}
	public void setRubrique(String rubrique) {
		this.rubrique = rubrique;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getNb_utilisateurs() {
		return nb_utilisateurs;
	}

	public void setNb_utilisateurs(int nb_utilisateurs) {
		this.nb_utilisateurs = nb_utilisateurs;
	}

	public int getValidation() {
		return validation;
	}

	public void setValidation(int validation) {
		this.validation = validation;
	}
	
	
	

}
