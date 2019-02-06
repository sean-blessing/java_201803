import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ContactManagerPredicateApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		System.out.println("Print name of all contacts");
		processContacts(contacts, c -> System.out.println(c.getName()));
		
		System.out.println("Print toString() of all contacts");
		processContacts(contacts, c -> System.out.println(c));
		
		System.out.println("Change the names of all contacts to upper case");
		processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
		processContacts(contacts, c -> System.out.println(c));
		
		System.out.println("Bye");

	}
	
	private static void processContacts(List<Contact> contacts,
												Consumer<Contact> consumer) {
		for (Contact c: contacts) {
			consumer.accept(c);
		}
	}

}
