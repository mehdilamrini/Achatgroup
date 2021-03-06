package achatcollectif.model;

import java.util.Date;

public class Utilisateurs {

	private long id_utilisateurs;
	private String nom;
	private String prenom;
	private String password;
	private String email;
	private Date date_naissance ;
	private String dt;
	private int admin;
	
	public Utilisateurs(long id_utilisateurs, String nom, String prenom,String email ,String password, Date date_naissance,String dt, int admin) {

		super();
		this.id_utilisateurs = id_utilisateurs;
		this.email=email;
		this.nom = nom;
		this.prenom = prenom;
		this.password=password;
		this.date_naissance = date_naissance;
		this.admin = admin;
		this.dt=dt;
	}
	
	
	public Utilisateurs(long id_utilisateurs, String nom, String prenom,String email, Date date_naissance,int admin) {

		super();
		this.id_utilisateurs = id_utilisateurs;
		this.email=email;
		this.nom = nom;
		this.prenom = prenom;
		//this.password=password;
		this.date_naissance = date_naissance;
		this.admin = admin;
		//this.dt=dt;
	}
	

	public Utilisateurs() {
		super();
		
	}
	
		
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId_utilisateurs() {
		return id_utilisateurs;
	}

	public void setId_utilisateurs(long id_utilisateurs) {
		this.id_utilisateurs = id_utilisateurs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

	public Date getDate_naissance() {
		return date_naissance;
	}


	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}


	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}







}
