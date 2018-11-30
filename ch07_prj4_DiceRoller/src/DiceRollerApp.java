import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller App!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Roll the dice? ");
		String choice = sc.next();
		
		while(choice.equalsIgnoreCase("y")) {
			Dice dice = new Dice();
			dice.roll();
			System.out.println(dice.printRoll());
			
			System.out.print("Roll again?  ");
			choice = sc.next();
		}
		
		System.out.println("Bye");
	}

}
