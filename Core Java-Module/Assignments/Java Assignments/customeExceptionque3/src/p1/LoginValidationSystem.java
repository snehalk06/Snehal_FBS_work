package p1;

import java.util.Scanner;
//custom Exception 1

class InvalidUsernameException extends Exception{
	public String toString()
	{
		return "Invalid Username!";
	}
}
// custom exception 2

class InvalidPasswordException extends Exception{
	public String toString() {
		return "Invalid Password!";
	}
}

class Login{
	String username="admin";
	String password="12345";

	 public void validateUsername(String enteredUsername)
	            throws InvalidUsernameException {

	        if (!enteredUsername.equals(username)) {
	            throw new InvalidUsernameException();
	        }
	    }
	 // Password Validation Method
	    public void validatePassword(String enteredPassword)
	            throws InvalidPasswordException {

	        if (!enteredPassword.equals(password)) {
	            throw new InvalidPasswordException();
	        }
	    }
}
public class LoginValidationSystem {

	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		
		Login login=new Login();
		
		System.out.println("Enter USernmae");
		String user=sc.nextLine();
		try {
			//validate username
			
			login.validateUsername(user);
			
			int attempts=3;
			boolean success=false;
			
			
			//password Attempts
			while(attempts>0) {
				
				System.out.println("Enter password: ");
				String pass=sc.nextLine();
				
				
				
				try {
					//validate password
					login.validatePassword(pass);
					System.out.println("\nLogin Successful!");
					success=true;
					break;
				}
				catch(InvalidPasswordException ipe){
					attempts--;
					 System.out.println(ipe);
					   if (attempts > 0) {
	                        System.out.println("Remaining Attempts: "
	                                + attempts);
					
				}
				
			}
		}
			// Account Locked
            if (!success) {
                System.out.println("\nAccount Locked!");
            }
		}
		 catch (InvalidUsernameException iue) {
	            System.out.println(iue);
	        }

	}

}
