import java.text.NumberFormat;
import java.util.Scanner;

public class Chapter3App {

	public static void main(String[] args) {

		// 1st example
//		int a = 14;
//		int b = 8;
//		
//		int c = a / b;
//		int d = a % b;
//		
//		System.out.println("a / b = "+c);
//		System.out.println("a % b = "+d);

		// 2nd example - compound assignment
//		int a = 100;
//		a+=50;  // result should be 150
//		System.out.println(a);
//		a-=20;  // 130
//		System.out.println(a);
//		
//		int i = 1;   // 1
//		System.out.println(i);
//		i = i + 1;  // 2
//		System.out.println(i);
//		i++;		// 3
//		System.out.println(i);
//		i += 2;		//5
//		System.out.println(i);
//		
//		i %= 2;  //  remainder of 5 / 2... 1
//		System.out.println(i);
		
		// 3rd example - implicit casting
//		int a = 5;
//		double b = 6;
//		int c = a * (int)b;
		
		// 4th example - wrapper classes
//		Integer a = new Integer(5);
//		Integer b = new Integer(7);
//		System.out.println("a = "+a);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number:  ");
//		String strA = sc.next();
//		System.out.println(strA);
//		double dblA = Double.parseDouble(strA);
//		System.out.println(dblA);
		
		// 5th Math class
//		int a = 10;
//		int b = 20;
//		
//		int c = Math.max(b, a);
//		int d = Math.min(b, a);
//		
//		System.out.println("max = "+c);
//		System.out.println("min = "+d);
//		
//		Scanner sc = new Scanner(System.in);
//		String choice = "y";
//		while (choice.equalsIgnoreCase("y")) {
//			int r = (int)(100*Math.random())+1;
//			System.out.println("random #: "+r);
//			System.out.print("Continue?");
//			choice = sc.next();
//		}
		
		// 6th example - NumberFormat
		double sales = 350000.3366554;
		double interestRate = .025;
		double distanceToParisYard = 7268800;
		NumberFormat currencyFormat = 
				NumberFormat.getCurrencyInstance();
		NumberFormat pf = 
				NumberFormat.getPercentInstance();
		pf.setMaximumFractionDigits(3);
		NumberFormat nf = 
				NumberFormat.getNumberInstance();
		
		System.out.println(currencyFormat.format(sales));
		System.out.println(pf.format(interestRate));
		System.out.println(nf.format(distanceToParisYard));
		
		
		
		
		
		
	}

}
