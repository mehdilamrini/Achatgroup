package achatcollectif.metier;

import achatcollectif.dao.IUpdateDAO;
import achatcollectif.dao.UpdateDAO;

public class UpdateDealMetier implements  IUpdateDealMetier {
	
	IUpdateDAO dao = new UpdateDAO();
	
	public int UpdateDealM(long id_sujet , int validation) {
		
		return  dao.UpdateDeal(id_sujet, validation);
		
	}

}
