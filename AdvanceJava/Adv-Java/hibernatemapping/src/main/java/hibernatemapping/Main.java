package hibernatemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		
		
		Session session=HibernateConfig.getSessionFactory().openSession();
		
		
		Student student =new Student(101,"Snehal",new Address("house1","10",8758956,"Kolhapur","maharastra"));
		
		Transaction tx =session.beginTransaction();
		
		session.persist(student);
		tx.commit();
	
	
	
	}

}
