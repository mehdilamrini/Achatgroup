package achatcollectif.dao;

import java.util.Date;

public interface IUpdateDAO {
	
	
	public int UpdateProfil(long id_utilisateurs,String nom, String prenom, Date date_naissance,String email );
	public int UpdateDeal(long id_sujet,int validation );
}
