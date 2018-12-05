
public class MyConsole extends Console{

	@Override
	public String getString(String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			s = sc.nextLine();
			if (s.equals("")) {
				System.out.println("Input is required.  Please try again.");
			}
			else {
				isValid = true;
			}
		}
		return s;
	}

}
