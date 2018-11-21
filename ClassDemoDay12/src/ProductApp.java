
public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Product yelanasBook = new Product();
		yelanasBook.setCode("Java");
		yelanasBook.setDescription("Murach's Java Programming");
		yelanasBook.setPrice(57.50);
		
		System.out.println("Yelanas book = "+
							yelanasBook.getCode()+
							", "+yelanasBook.getDescription()+
							", "+yelanasBook.getPrice());
		
		Product garysBook = new Product("Java", "Murach's Java Programming",
										57.50);
		System.out.println(garysBook);
		
		System.out.println(Math.PI);
		System.out.println("Bye");

	}

}
