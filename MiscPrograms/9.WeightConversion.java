import java.util.Scanner;

class Converter {	
	//method to convert kg to lbs
	void kgToLbs(double kgWeight) {
		double lbsWeight = kgWeight*2.2;
		System.out.printf("Weight in LBS: %.2f\n", lbsWeight);
	}
	
	//method to convert lbs to kg
	void lbsTokg(double lbsWeight) {
			double kgWeight = lbsWeight*0.45359237;
			System.out.printf("Weight in LBS: %.2f\n", kgWeight);
		}
}

class Main {
	public static void main (String[] args) {
		//Declare variables
		int option;
		double weight;

		//Greet
		System.out.print("Welcome to Weight Converter!\n");

		//Provide options: 1. kg to lbs or 2. lbs to kg
		Scanner s = new Scanner(System.in);

		System.out.println("");
		System.out.println("Would you like to convert: ");
		System.out.println("1. From KG to LBS\t2. From LBS to KG");

		System.out.print("Choice(1/2): ");
		option = s.nextInt();

		//method to take user input	
		System.out.print("Weight: ");
		weight = s.nextDouble();

		//Create conversion object reference and pass needed arguements to the methods
		Converter c = new Converter();
		if (option == 1) {
			c.kgToLbs(weight);
		}
		else {
			c.lbsTokg(weight);

		}
		//print result
	}
}
