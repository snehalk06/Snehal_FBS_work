package Hibernatemapping;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	private static SessionFactory sf  ;
	
	static {
		try {
		Properties props = new Properties();
		InputStream is = HibernateConfig.class.getClassLoader().getResourceAsStream("application.properties");
		
			props.load(is);
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Address.class);
		config.addAnnotatedClass(Batch.class);
		config.setProperties(props);
		
		
		
		sf = config.buildSessionFactory();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
		
	}

}
