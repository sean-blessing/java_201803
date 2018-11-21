import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the guess the number game");

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			int theNumber = generateRandomNumber();
			System.out.println("I'm thinking of a number from 1 to 100.\n" + "Try to guess it.\r\n");
			System.out.println();
			int guess = 0;
			int count = 0;
			while (guess!=theNumber) {
				guess = getIntWithinRange(sc,"Enter a number:  ",1,100);
				count++;
				if (guess == theNumber) {
					System.out.println(getCorrectMessage(count));
				}
				else {
					System.out.println(getMissMessage(guess, theNumber));
				}
			}	
			System.out.println();
			choice = getStringValues(sc, "Try Again?", "y", "n");
		}

		System.out.println("Bye");
	}
	
	private static String getCorrectMessage(int count) {
		String str = "";
		
		if (count<=3) 
			str = "Great work! You are a mathematical wizard.";
		else if (count <= 7)
			str = "Not too bad! You've got some potential.";
		else
			str = "What took you so long? Maybe you should take some lessons.";
		return str;
	}
	private static String getMissMessage(int guess, int number) {
		String str = "";
		
		int diff = guess - number;
		if (diff > 10) 
			str = "Way too high";
		else if (diff > 0) 
			str = "Too high";
		else if (diff < -10) 
			str = "Way too low";
		else 
			str = "Too low";
		
		return str;
	}

	private static String getStringValues(Scanner sc, String prompt, String val1, String val2) {
		String retStr = "";
		boolean isValid = false;

		while (!isValid) {
			System.out.println(prompt);
			retStr = sc.next();
			if (retStr.equalsIgnoreCase(val1) || retStr.equalsIgnoreCase(val2)) {
				isValid = true;
			} else {
				System.out.println("Invalid entry.  Try again.");
			}
		}

		return retStr;
	}

	private static int getIntWithinRange(Scanner sc, String prompt, int val1, int val2) {
		int n = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n < val1) {
					System.out.println("Number must be greater than or equal to "+val1);
				} else {
					if (n > val2) {
						System.out.println("Number must be less than or equal to "+val2);
					}
					else {
						isValid = true;
					}
				}
			}
			else {
				System.out.println("Not a whole number... try again.");
				sc.nextLine();
			}
		}

		return n;
	}
	
	private static int generateRandomNumber() {
		int r = (int)((Math.random()*100)+1);
		return r;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
