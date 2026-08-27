package hibernatemapping;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	private static SessionFactory sessionfactory;
	

    static {

        try {

            Properties props = new Properties();

            InputStream is = HibernateConfig.class
                    .getClassLoader()
                    .getResourceAsStream("application.properties");

            props.load(is);   // Properties file load hogi

            Configuration config = new Configuration();
            config.setProperties(props);
            config.addAnnotatedClass(Student.class);
            config.addAnnotatedClass(Address.class);


            sessionfactory = config.buildSessionFactory();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


	public static SessionFactory getSessionFactory() {
		
		return sessionfactory;
	}

}
