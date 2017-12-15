package achatcollectif.model;

public class Commentaires {

	private long id_commentaire;
	private long id_utilisateurs;
	private long id_sujet;
	private String commentaire;


	public Commentaires(long id_commentaire, long id_utilisateurs, long id_sujet, String commentaire) {
		super();
		this.id_commentaire = id_commentaire;
		this.id_utilisateurs = id_utilisateurs;
		this.id_sujet = id_sujet;
		this.commentaire = commentaire;
	}
	
	public Commentaires() {
		super();
	}
	





	public long getId_commentaire() {
		return id_commentaire;
	}

	public void setId_commentaire(long id_commentaire) {
		this.id_commentaire = id_commentaire;
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


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}




}
