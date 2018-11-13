import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter loan amount:  ");
			BigDecimal amt = sc.nextBigDecimal();
			
			System.out.print("Enter interest rate:  ");
			BigDecimal rate = sc.nextBigDecimal();
			
			BigDecimal interestAmt = amt.multiply(rate);
			System.out.println("BD interestAmt = "+interestAmt.toString());
			// we have to reassign interestAmt because setScale returns a new
			// BigDecimal... it does NOT affect the variable it is called on
			interestAmt = interestAmt.setScale(2, RoundingMode.HALF_UP);
			
			NumberFormat cInstance = NumberFormat.getCurrencyInstance();
			NumberFormat pInstance = NumberFormat.getPercentInstance();
			pInstance.setMinimumFractionDigits(3);
			
			System.out.println("Loan amount:    "+cInstance.format(amt));
			System.out.println("Interest rate:  "+pInstance.format(rate));
			System.out.println("Interest:       "+cInstance.format(interestAmt));

			System.out.print("Continue?  ");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("bye");
	}

}
