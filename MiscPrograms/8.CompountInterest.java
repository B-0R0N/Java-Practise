import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		double amount, principle, rate, borrowTime, compoundCount;
		String unit;

		Scanner s = new Scanner(System.in);

		
		System.out.print("Enter principle amount: ");
		principle = s.nextDouble();
		
		System.out.print("Enter rate in percent: ");
		rate = s.nextDouble();

		System.out.print("Enter the borrow time: ");
		borrowTime = s.nextDouble();

		System.out.print("Enter the no of times to compound: ");
		compoundCount = s.nextDouble();

		s.nextLine();

		System.out.print("Enter currency unit: ");
		unit = s.nextLine();

		amount = principle*Math.pow((1+(rate/100)/compoundCount), compoundCount*borrowTime);

		System.out.printf("Amount: %,5.2f %s", amount, unit);
		s.close();
	}
}
