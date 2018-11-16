import java.util.Scanner;

public class ClassDemoDay8App {

	public static void main(String[] args) {
//		int quantity = 0;
//		int maxQuantity = 100;
//		
//		System.out.println("quantity = " + quantity);
//		quantity = 10;
//		System.out.println("quantity = " + quantity);
//		
//		quantity = maxQuantity;
//		System.out.println("quantity = " + quantity);
//		
//		int number = 10;
//		
//		System.out.println(number);
//		
//		int x = 14;
//		int y = 8;
//		
//		int r1 = x + y;
//		int r2 = x-y;
//		int r3 = x*y;
//		int r4 = x/y;
//		
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r3);
//		System.out.println(r4);
//		
//		double a = 8.5;
//		double b = 3.4;
//		double r5 = a+b;
//		double r6 = a-b;
//		double r7 = a*b;
//		double r8 = a/b;
//		
//		System.out.println(r5);
//		System.out.println(r6);
//		System.out.println(r7);
//		System.out.println(r8);
		
//		double c = 5.0;
//		double d = 7.3;
//		d += c;
//		
//		System.out.println(d);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter a number:  ");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter another number:  ");
//		int b = sc.nextInt();
//		
//		System.out.println("Sum = "+ (a + b));

		String choice = "";
		System.out.println("hello");
		while (!choice.equalsIgnoreCase("n")) {
			System.out.println("Enter a sentence...");
			int a = sc.nextInt();
			String b = sc.next();
			String c = sc.nextLine();
			
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("c = "+c);
			
			System.out.println("Continue???");
			choice = sc.next();
		}
		
		System.out.println("bye");
		
		
		
		
		
		
		
		
		
		
	}

}
