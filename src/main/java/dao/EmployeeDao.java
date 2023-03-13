package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.iset.entities.Employee;
import com.iset.util.JPAutil;

public class EmployeeDao {
	private EntityManager entityManager=JPAutil.getEntityManager("DemoRelationJPA");
	
	 public   void ajouter(Employee e)
		{
		 	EntityTransaction tx = entityManager.getTransaction();
		 	tx.begin();
		 	entityManager.persist(e);
		 	tx.commit();  
		}
}
