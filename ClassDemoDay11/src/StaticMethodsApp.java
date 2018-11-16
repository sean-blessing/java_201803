import java.util.InputMismatchException;
import java.util.Scanner;

public class StaticMethodsApp {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			int a = 0;
			int b = 0;
//			try {
				// get a number
				a = promptUserForInt("Enter a number:  ", sc);
				
				// get another number
				b = promptUserForInt("Enter another number:  ", sc);
//			}
//			catch (Exception e) {
//				System.out.println("Invalid # entered.  Please try again.");
//				sc.nextLine();  //clear the tokens from stream
//				continue;
//			}
				
			int sum = sumTwoNumbers(a, b);
			System.out.println("Sum = "+sum);
			
			System.out.println("Continue?  ");
			choice = sc.next();
		}
		
		doSomething();

		System.out.println("Bye");
	}
	
	private static int promptUserForInt(String prompt, Scanner scan) {
		int num = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			if (scan.hasNextInt()) {
				num = scan.nextInt();
				isValid = true;
			}
			else {
				System.out.println("Invalid input.  try again");
				scan.nextLine();
				continue;
			}
		}
		return num;
	}
	
	private static int sumTwoNumbers(int a, int b) {
		int c = a + b;
		return c;
	}
	
	private static void doSomething() {
		System.out.println("Whassssuuuuuup!!!!!!!!!");
	}

}
