package achatcollectif.model;

import java.util.Date;

public class Sujet {
	

	private long id_sujet;
	private long id_utilisateurs;
	private String titre;
	private double prix_initial;
	private double prix_final;
	private Date date ;
	private String rubrique;
	private String description ;
	
	
	
	public long getId_utilisateurs() {
		return id_utilisateurs;
	}


	public void setId_utilisateurs(long id_utilisateurs) {
		this.id_utilisateurs = id_utilisateurs;
	}
	
	
	
	
	public Sujet(long id_sujet, long id_utilisateurs, String titre, double prix_initial, double prix_final, Date date,
			String rubrique, String description) {
		super();
		this.id_sujet = id_sujet;
		this.id_utilisateurs = id_utilisateurs;
		this.titre = titre;
		this.prix_initial = prix_initial;
		this.prix_final = prix_final;
		this.date = date;
		this.rubrique = rubrique;
		this.description = description;
	}


	public Sujet() {
		super();
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	
	

}
