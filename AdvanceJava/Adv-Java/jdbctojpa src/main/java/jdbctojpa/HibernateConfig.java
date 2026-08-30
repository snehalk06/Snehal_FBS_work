package jdbctojpa;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	static SessionFactory sessionFactory;

	static {
		Configuration config = new Configuration();
		config.configure()
	}

}

