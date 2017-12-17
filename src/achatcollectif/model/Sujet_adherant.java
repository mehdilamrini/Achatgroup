package achatcollectif.model;

public class Sujet_adherant {

	private long id_adh_sujet;
	private long id_sujet;
	private long id_utilisateurs;



	public Sujet_adherant(long id_adh_sujet, long id_sujet, long id_utilisateurs) {
		super();
		this.id_adh_sujet = 	id_adh_sujet;
		this.id_sujet = id_sujet;
		this.id_utilisateurs = id_utilisateurs;
	}


	public Sujet_adherant() {
		super();

	}


	public long getId_adh_sujet() {
		return id_adh_sujet;
	}


	public void setId_adh_sujet(long id_adh_sujet) {
		this.id_adh_sujet = id_adh_sujet;
	}


	public long getId_sujet() {
		return id_sujet;
	}


	public void setId_sujet(long id_sujet) {
		this.id_sujet = id_sujet;
	}


	public long getId_utilisateurs() {
		return id_utilisateurs;
	}


	public void setId_utilisateurs(long id_utilisateurs) {
		this.id_utilisateurs = id_utilisateurs;
	}








}
