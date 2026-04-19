import java.util.Scanner;

public class PrintfMania {
	public static void main(String[] args) {
		int num1, num2;
		double decimal;
		String name;

		name = "Billa";
		num1 = 2000000;
		num2 = -3323333;
		decimal = Math.PI;
		
		System.out.printf("Name: %8s\n", name);
		System.out.printf("Num1: %,12d\nNum2: %,12d\n", num1, num2);
		System.out.printf("Double:%6.2f\n", decimal);
	}	
}
