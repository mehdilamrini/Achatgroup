package achatcollectif.model;

public class Sujet_adherant {
	
	private long id_sujet_adh;
	private long id_sujet;
	private long id_utilisateurs;
	
	
	public long getId_sujet_adh() {
		return id_sujet_adh;
	}
	public Sujet_adherant(long id_sujet_adh, long id_sujet, long id_utilisateurs) {
		super();
		this.id_sujet_adh = id_sujet_adh;
		this.id_sujet = id_sujet;
		this.id_utilisateurs = id_utilisateurs;
	}
	public void setId_sujet_adh(long id_sujet_adh) {
		this.id_sujet_adh = id_sujet_adh;
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
