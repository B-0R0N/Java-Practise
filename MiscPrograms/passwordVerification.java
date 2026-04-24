//import scanner
import java.util.Scanner;

//greet and give valid password structure
class Greet {
	void greet() {
		System.out.println("Hello, your passsword must be 12 length in size or greater, and have at least 1 capitalized letter, 1 small letter, 1 number, and special character...");
	}
}

class Verifier {
	boolean isValid = false;
	while (!isValid) {
		//take password input
		Scanner s = new Scanner(System.in);
		String password;
		void input() {
			System.out.print("password: ");
			password = s.nextLine();
		}
		if (password.length() >= 12 && !password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase()) && password.mathches) {
			
		}
	}
}
//start loop to keep asking for password as long as a valid one is entered
//check if the length is greater or equal to 12
//Check if the password has a capital letter
//Check if the password has a lower letter
//check if the password has special character
//check if the password has a number

