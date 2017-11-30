package achatcollectif.model;

public class Commentaires {
	
	private long id_commentaires;
	private long id_utilisateurs;
	private long id_sujet;
	private String description;
	
	
	public long getId_commentaires() {
		return id_commentaires;
	}
	public void setId_commentaires(long id_commentaires) {
		this.id_commentaires = id_commentaires;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Commentaires(long id_commentaires, long id_utilisateurs, long id_sujet, String description) {
		super();
		this.id_commentaires = id_commentaires;
		this.id_utilisateurs = id_utilisateurs;
		this.id_sujet = id_sujet;
		this.description = description;
	}
	
	
	

}
