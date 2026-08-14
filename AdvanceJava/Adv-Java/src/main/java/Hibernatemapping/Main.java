package Hibernatemapping;

import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Address address = new Address(
                "H-101",
                "MG Road",
                "Pune",
                "Maharashtra",
                411001
        );

        Batch batch = new Batch(
                "B107",
                "Java Full Stack",
                LocalDateTime.now()
        );

        Student student = new Student(
                "FRN101",
                "Snehal",
                address,
                batch
        );

        System.out.println(student);
        
        
       Session session= HibernateConfig.getSessionFactory().openSession();
       
       Transaction tx =session.beginTransaction();
       
       session.persist(student);
       tx.commit();
    }
}