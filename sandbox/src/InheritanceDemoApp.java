
public class InheritanceDemoApp {

	public static void main(String[] args) {
		
		System.out.println("Hello");

		ParentClass pc = new ParentClass("Parent");
		
		System.out.println("pc = "+pc);
		
		ChildClass cc = new ChildClass("Child");
		
		System.out.println("cc = "+cc);
		
		
		System.out.println("Bye");
	}

}
