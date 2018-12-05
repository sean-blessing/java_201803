
public class MainApp {

	public static void main(String[] args) {
		System.out.println("hello");
		
		Student student1 = new Student(1, "Boris", "Chen");
		Course course1 = new Course(1, "Java Bootcamp");
		Course course2 = null;
		try {
			course2 = (Course) course1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(student1.print());
		System.out.println(course1.print());
		System.out.println(course2.toString());
		System.out.println("bye");
	}

}
