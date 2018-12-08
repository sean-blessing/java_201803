import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		ArrayList<String> students = new ArrayList<>();
		students.add("Yelena");
		students.add("Nick");
		students.add("Katrina");
		students.add("Gary");
		students.add("Boris");
		students.add("Eric");
		
		System.out.println(students);
		
		students.add(1,"Lisa");
		
		System.out.println(students);
		
		System.out.println(students.get(5));
		System.out.println("Nick is index "+students.indexOf("Nick"));
		
		System.out.println("sort it...");
		Collections.sort(students);
		System.out.println(students);
		System.out.println("Bye");
	}

}
