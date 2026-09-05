package springFrameworkDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//ab setter getter nikal sakte ho annotations ke bad
//explore bean factory vs application context
@Controller
@RequestMapping("/student")
public class StudentController 
{
	@Autowired
  @Qualifier("abcd")
	StudentServiceInterface studentService;
	


	public  StudentController (){
		System.out.println("Student controller ka object bana");
		
	}
	@GetMapping("/test")
	public void test() {
		
		
		System.out.println("Student controller working");
		studentService.demo();
	}

}
