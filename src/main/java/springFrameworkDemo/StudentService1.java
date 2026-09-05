package springFrameworkDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("abcd")
//@Primary
public class StudentService1 implements StudentServiceInterface {
	
	@Autowired
	StudentRepository studentRepo;
	
	

	public StudentService1() {
		System.out.println("studentservice1 ka object bana");
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
