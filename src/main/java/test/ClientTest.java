package test;

import dao.ClientDao;
import com.iset.entities.Client;

public class ClientTest {

	public static void main(String[] args) {
    	//cr�er  un  objet client
		Client c = new Client();
		c.setNom("Bel Hadj yassine");
		c.setVille("Paris");
		//ajouter l'objet client � la BD
		ClientDao cltDao = new ClientDao();
		cltDao.ajouter(c);	  
 		 
		
		System.out.println("Appel de la m�thode listerTous");
		for (Client cl : cltDao.listerTous())
			System.out.println(cl.getCode()+" "+cl.getNom()+" "+cl.getVille());
		
		System.out.println("Appel de la m�thode listerParNom");
		for (Client cl : cltDao.listerParNom("nadh"))
			System.out.println(cl.getCode()+" "+cl.getNom()+" "+cl.getVille());
		
		//tester les autres m�thodes de la classe ClientDao
	}
}

