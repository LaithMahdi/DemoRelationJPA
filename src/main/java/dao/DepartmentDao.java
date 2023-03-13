package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iset.entities.Client;
import com.iset.entities.Department;
import com.iset.util.JPAutil;

public class DepartmentDao {
	private EntityManager entityManager=JPAutil.getEntityManager("DemoRelationJPA");
	
	public   void ajouter(Department dept)
	{
	 	EntityTransaction tx = entityManager.getTransaction();
	 	tx.begin();
	 	entityManager.persist(dept);
	 	tx.commit();  
	}
	
	 //m�thode Consulter d'une entit� �  partir de la bd
	 public  Department Consulter(Department d,Object id)
	{
	 	return entityManager.find(d.getClass(), id);
		}
}
