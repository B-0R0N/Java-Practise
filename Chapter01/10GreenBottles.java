//Coding a serious business application; Page 102; 2026 April 20
public class tenGreenBottles {
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
		if (i - 1 == 0){	
				System.out.printf("%d green bottle hanging on the wall,\n", i);
				System.out.printf("%d green bottle hanging on the wall,\n", i);
				System.out.printf("And if that green bottle should accidentally fall,\n");
				System.out.printf("There'll be no green bottles hanging on the wall.\n");
			}
			else {
				System.out.printf("%d green bottles hanging on the wall,\n", i);
				System.out.printf("%d green bottles hanging on the wall,\n", i);
				System.out.printf("And if one green bottle should accidentally fall,\n");
				System.out.printf("There'll be %d green bottles hanging on the wall.\n", i - 1);
			}
			System.out.println("");
		}
	}
}
