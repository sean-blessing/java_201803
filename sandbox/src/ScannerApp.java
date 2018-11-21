import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence:  ");
		
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		System.out.println("Bye");

	}

}
