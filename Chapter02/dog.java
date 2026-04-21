class dogClass {
	int age;
	String name;

	void bark(int a) {
		for (int i = 0; i < a; i++) {
			System.out.print("Ruff! ");
		} 
	}
		
}

public class dog {
	public static void main(String[] args) {
		dogClass myDog = new dogClass();
		myDog.age = 12;
		myDog.name = "Sebastian";

		System.out.printf("My dog's name is %s and he is %d years old!\n", myDog.name, myDog.age);
		myDog.bark(30);
	}
}
