package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.iset.entities.Client;
import com.iset.util.JPAutil;


//classe contenant les m�thodes g�n�riques ajouter,  supprimer, consulter par cl� primaire (Id)
public  class ClientDao {
private EntityManager entityManager=JPAutil.getEntityManager("MonProjetJPA");
 
//m�thode ajouter d'une entit� �  la bd
	 public   void ajouter(Object c)
	{
	 	EntityTransaction tx = entityManager.getTransaction();
	 	tx.begin();
	 	entityManager.persist(c);
	 	tx.commit();
	 	  
	}
	 
	 //m�thode modifier d'une entit� �  partir de la bd
	 public   void modifier(Client c)
		{
		 	EntityTransaction tx = entityManager.getTransaction();
		 	tx.begin();
		 	entityManager.merge(c);
		 	tx.commit();
		 	  
		}
	 
	 //m�thode Supprimer d'une entit� �  partir de la bd
	 public  void supprimer(Client c)
	{ 
		EntityTransaction tx = entityManager.getTransaction();
	    tx.begin();
	    c=entityManager.merge(c); // important
	    entityManager.remove(c);
	    tx.commit();  
	}
	 
	 //m�thode Consulter d'une entit� �  partir de la bd
	 public  Client Consulter(Client c,Object id)
	{
	 	return entityManager.find(c.getClass(), id);
		}
	 
	 //m�thode pour lister tous les objets�  partir de la bd
	 public List<Client> listerTous() {
		 List<Client> clients =entityManager.createQuery( "select c from Client c").getResultList();
		 return clients;
		 }
	 
	//m�thode pour lister tous les objets�  partir de la bd
		 public List<Client> listerParNom(String nom) {
			 List<Client> clients =entityManager.createQuery( "select c from Client c where c.nom like :pnom")
					 				            .setParameter("pnom", "%"+nom+"%").getResultList();
			 return clients;
			 }
	 
}
