package springFrameworkDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentService2 implements StudentServiceInterface {

@Autowired
StudentRepository studentRepo;
	public StudentService2() {
		System.out.println("studentservice2 ka object bana");
	}
	
	
	public void demo() {
		System.out.println("Student service1 working");
		studentRepo.repodemo();
	}


	@Override
	public void demoMethod() {
		// TODO Auto-generated method stub
		
	}




}
