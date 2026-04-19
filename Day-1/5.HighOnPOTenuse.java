import java.util.Scanner;

public class HighOnPOTenuse {
	public static void main(String[] args) {
		double base, adjacent, hypotenuse;
		String unit;

		Scanner s = new Scanner(System.in);

		System.out.print("Unit in use: ");
		unit = s.nextLine();

		System.out.print("Base: ");
		base = s.nextDouble();

		System.out.print("Adjacent: ");
		adjacent = s.nextDouble();

		hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(adjacent, 2));
		
		System.out.println();
		System.out.println("Hypotenuse: "+hypotenuse+" "+unit);
		
		s.close();
	}
}
