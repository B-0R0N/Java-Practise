import java.util.Scanner;
public class CircleOfAllTrades {
	public static void main(String[] args) {
		String unit;
		double radius, circumference, area, volume;

		Scanner s = new Scanner(System.in);
		
		System.out.print("Radius: ");
		radius = s.nextDouble();
		s.nextLine();
		System.out.print("Unit: ");
		unit = s.nextLine();

		System.out.println("Circumference: "+2*Math.PI*radius+" "+unit);
		System.out.println("Area: "+Math.PI*Math.pow(radius, 2)+" "+unit+"^2");
		System.out.println("Volume: "+(4.0/3.0)*Math.PI*Math.pow(radius, 3)+" "+unit+"^3");
		s.close();
	}
}
