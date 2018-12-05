
public class NumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Odd/Even Checker!");
		
		MyConsole mc = new MyConsole();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int i = mc.getInt("Enter an integer: ");
			String evenOdd = "odd";
			evenOdd = evenOddCheck(i, evenOdd);
			System.out.println("The number " + i + " is " + evenOdd);
			choice = mc.getString("Continue? ");
		}
		
		System.out.println("Bye!");

	}

	private static String evenOddCheck(int i, String evenOdd) {
		if (i % 2 == 0) {
			evenOdd = "even";
		}
		return evenOdd;
	}

}
