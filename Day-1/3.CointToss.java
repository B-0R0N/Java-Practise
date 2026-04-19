import java.util.Random;

public class coinToss {
	public static void main(String[] args) {
	Boolean state;
	int dice1, dice2;

	Random r = new Random();

	state = r.nextBoolean();
	dice1 = r.nextInt(1, 7);
	dice2 = r.nextInt(1, 7);
	
	if(state) {
		System.out.println("Heads");
	}
	else {
		System.out.println("Tails");
	}
	System.out.println("Dice 1: "+dice1);
	System.out.println("Dice 2: "+dice2);

	}
}
