import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ContactManagerStreamsApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All contacts...");
		contacts.stream().forEach(c -> System.out.println(c));
		
		System.out.println("Contacts without phone...");
		contacts.stream().filter(c -> c.getPhone() == null)
			.forEach(c -> System.out.println(c));
		
		List<Contact> cnp = contacts.stream().filter(c -> c.getPhone()==null)
				.collect(Collectors.toList());
		System.out.println("There are "+cnp.size()+" contacts with no phone number.");
		
		List<String> contactNames = contacts.stream().map(Contact::getName)
				.collect(Collectors.toList());
		contactNames.stream().forEach(System.out::println);
		
		System.out.println("Bye");

	}
	
}
