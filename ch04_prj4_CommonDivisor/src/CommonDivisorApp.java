import java.util.Scanner;

public class CommonDivisorApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the common divisor app!");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter first number:  ");
			int nbr1 = sc.nextInt();
			
			System.out.println("Enter second number:  ");
			int nbr2 = sc.nextInt();
			
//			int cd = getCommonDivisor(Math.min(nbr1, nbr2),
//										Math.max(nbr1, nbr2));
			int cd = getCommonDivisor(nbr1, nbr2);

			System.out.println("Greatest common divisor:  "+cd);
			System.out.println();
			System.out.println("Continue? ");
			sc.next();
		}
		
		System.out.println("Bye");
	}
	
	private static int getCommonDivisor(int x, int y) {
		int commonDivisor = 0;
		while (x > 0) {
			while (y >= x) {
				y -= x;
			}
			// swap
			int z = y;
			y = x;
			x = z;
			commonDivisor = y;
		}
		return commonDivisor;
	}
}
