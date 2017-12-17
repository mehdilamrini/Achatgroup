// default package
// Generated 16 déc. 2017 20:00:14 by Hibernate Tools 5.2.6.Final

import java.util.Date;

/**
 * Utilisateurs generated by hbm2java
 */
public class Utilisateurs implements java.io.Serializable {

	private Integer idUtilisateurs;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private Date dateNaissance;
	private Integer admin;

	public Utilisateurs() {
	}

	public Utilisateurs(String nom, String prenom, String email, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}

	public Utilisateurs(String nom, String prenom, String email, String password, Date dateNaissance, Integer admin) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.dateNaissance = dateNaissance;
		this.admin = admin;
	}

	public Integer getIdUtilisateurs() {
		return this.idUtilisateurs;
	}

	public void setIdUtilisateurs(Integer idUtilisateurs) {
		this.idUtilisateurs = idUtilisateurs;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Integer getAdmin() {
		return this.admin;
	}

	public void setAdmin(Integer admin) {
		this.admin = admin;
	}

}