import java.util.Scanner;

class Dog {
	private String name;
	private int size;

	public String getName () {
		return name;
	}

	public void setName (String a) {
		if(a.equals("")) {
			System.out.println("Enter a valid name!!!");
		}
		else {
			name = a;
		}
	} 

	public int getSize () {
		return size;
	}

	public void setSize (int a) {
		if (a <= 1) {
			System.out.println("Enter a valid size!!!");
		} 
		else {
			size = a;
		}
	}

	void bark(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Bark!!!");
		}
	}
}

public class encapsulation {
	public static void main (String[] args) {
		Dog d1 = new Dog();
		Scanner s = new Scanner(System.in);
		



		System.out.print("Enter dog name: ");
		d1.setName(s.nextLine());
		
		System.out.print("Enter Size: ");
		d1.setSize(s.nextInt());

		
		System.out.printf("This is %s\n", d1.getName());
		System.out.printf("He is size %d\n", d1.getSize());
		d1.bark(3);
	}
}
