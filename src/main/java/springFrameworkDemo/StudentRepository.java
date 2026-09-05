package springFrameworkDemo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class StudentRepository {
	
	public StudentRepository() {
		System.out.println("Student repository ka object bana");
	}
	
	public void repodemo() {
		System.out.println("student repo working");
	}

}
