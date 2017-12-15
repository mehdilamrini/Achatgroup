package achatcollectif.metier;

import java.util.List;

public interface ILoginMetier {

	
	List<?> LoginUtilisateur(String email , String password);
	
}
