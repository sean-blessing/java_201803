
public class RefVsPrimitiveApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		double a = 25.50;
		double b = a;
		
		System.out.println("a = "+a+", b = "+b);
		
		b = 55.25;
		
		System.out.println("a = "+a+", b = "+b);
		
		Product ericsBook = new Product("java", "java book", 55.50);
		Product borissBook = ericsBook;
		System.out.println(ericsBook);
		System.out.println(borissBook);
		
		borissBook.setPrice(100.33);
		
		System.out.println(ericsBook);
		System.out.println(borissBook);
		
		
		System.out.println("Goodbye");
	}

}
