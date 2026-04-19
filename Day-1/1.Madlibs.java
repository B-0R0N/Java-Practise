import java.util.Scanner;

public class Madlibs{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		

		System.out.print("Enter a number: ");
		int number = s.nextInt();
		s.nextLine();
		System.out.print("Enter an adjective: ");
		String adjective = s.nextLine();

		System.out.print("Enter the name of a food: ");
		String food = s.nextLine();

		System.out.print("Enter name of a TV show: ");
		String tvShow = s.nextLine();

		System.out.println("There once were "+number+" boys who loved watching "+tvShow+"!");
		System.out.println("They were "+adjective+" little boys who loved eating "+food+"!!");
		s.close();
	}
}
