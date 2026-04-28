/*	Algorithm
/
START
----------INIT OF ARRAYS-----------
1. Initialize a game array of size 7, fill it with natural numbers up to 7.
2. Initialize a startup array of size 3, its starting value wil begin from 
number 1 to 5 to fit in the game array and let the remaining 2 numbers be 
an increment from the starting value.
----------LOOP GAME LOGIC------------
3. Set a isGameOver flag to flase and run a while loop as long as the flag is false. The game will return a true flag to end the game only if all startup value has been hit or the user runs out of positions to attack.
4. Inside while loop, place the scanner to continuously take input.
5. Make sure the 'gameArray' contains input, else print invalid
6. Check if 'startupArray' contains value user specified
	i. If it does && startup array is not 0; print hit, remove input from startupArray
	ii. Else If 'startUpArray' size is 0; print kill, set 'isGameOver' true.
	iii. Else; print miss, remove input from gameArray
7. remove user input at the end of loop, from the game array and startup array.

----------NEW ADDITIONS------------
8. Miss count & Game message
STOP


NOTE: //Statements// Were used during development for debugging.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Game {
	public static void main (String[] args) {
		// ### 1. Object Reference declarations: 
		Scanner s = new Scanner(System.in);
		
		Random r = new Random();

		ArrayList<Byte> gameArray = new ArrayList<>();
		ArrayList<Byte> startupArray = new ArrayList<>();



		// ### 2. Variable declarations: 
		byte userGuess = 0;
		byte guessCount = 0;

		char isGameOver = 'f';
		char isValidInput = 'f';

		byte randomStart = (byte)(r.nextInt(22) + 1);



		// ### 3. Initialization of arrays:
		for (byte i = 1; i <= 24; i++) {
			gameArray.add(i);
		}
		System.out.println(gameArray);
		System.out.println("");
		System.out.println("-QUICK SOLDIER! BOMB THE SHITTY A.I STARTUP HIDING IN THE ARRAY!");
		System.out.println("-TRY NOT TO MISS MUCH! THOSE BOMBS AIN'T CHEAP!");
		System.out.println("-THE STARTUP IS 3 INTEGERS IN SIZE I.E. [4, 5, 6] WILL YIELD HIT IF YOU INPUT THOSE NUMBERS AND WILL KILL IT IF YOU HIT ALL 3 NUMBERS!");
		System.out.println("");
		for (byte i = 0; i < 3; i++) {
			startupArray.add(randomStart);
			randomStart++;
		}
		//System.out.println(startupArray);//



		// ### 4. Game Loop: 
		while (isGameOver != 't') {
			// ## 4.1 Taking user input.
			System.out.print("POSITION: ");
			userGuess = s.nextByte();

			// ## 4.2 Checking input validity.
			if (gameArray.contains(userGuess)) {
				isValidInput = 't';
			} else {
				System.out.println("Invalid Or Repeated Input");
			}

			// ## 4.3 Hit, Miss, Kill Check;
			boolean inStartupArray = startupArray.contains(userGuess);
			int sizeStartupArray = startupArray.size()-1;
			//System.out.println("Size of startupArray: "+sizeStartupArray);//
			if (inStartupArray && sizeStartupArray != 0) {
				System.out.println("HIT!");
			} else if (inStartupArray && sizeStartupArray == 0) {
				System.out.println("KILL!");
				isGameOver = 't';
			} else {
				if(isValidInput == 't'){
					System.out.println("MISS!");
					guessCount++;
				}
			}
			
			// ### 4.4 Removing used values from both game and startup arrays.
			gameArray.remove(Byte.valueOf(userGuess));
			startupArray.remove(Byte.valueOf(userGuess));
			//System.out.println("New gameArray: "+gameArray);//
			//System.out.println("New startupArray: "+startupArray);//
			//System.out.println("User Input: " + userGuess);//
			
			// ### 4.5 Reset the isValidInput flag to false.
			isValidInput = 'f';
			System.out.println("");
			System.out.println("");


		}

		System.out.printf("You Missed %d Times!!!", guessCount);

	}
}
