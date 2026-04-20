import java.util.Scanner;

public class shoppingCart {
	public static void main(String[] args) {
		String itemName;
		double price;
		int quantity;
		String currency;

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter item name: ");
		itemName = s.nextLine();

		System.out.print("Enter item price: ");
		price = s.nextDouble();

		System.out.print("Enter item quantity: ");
		quantity = s.nextInt();
		s.nextLine();

		System.out.print("Enter the currency being used: ");
		currency = s.nextLine();

		System.out.println(" ");
		System.out.println("You have purchased "+quantity+" "+itemName+"/s.");
		System.out.println("Your total price is: "+price*quantity+" "+currency):
		}
}
