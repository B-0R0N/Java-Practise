import java.util.Scanner;

public class rectangleArea {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Unit: ");
		String u = s.nextLine();
		System.out.print("Enter Length: ");
		double l = s.nextDouble();
		System.out.print("Enter Breadth: ");
		double b = s.nextDouble();

		System.out.println("The area of your rectangle is "+l*b+" "+u+"^2!");

	}
	s.close();
}
