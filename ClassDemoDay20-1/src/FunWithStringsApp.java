
public class FunWithStringsApp {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumped over the log.";
		
		System.out.println("sentence is:  "+sentence);
		System.out.println("length is "+sentence.length());
		
		int s = sentence.indexOf(" ");
		System.out.println("s = "+s);
		
		int s2 = sentence.indexOf(" ",s+1);
		System.out.println("s2 = "+s2);

		char c = sentence.charAt(20);
		System.out.println(c);
		
		String str1 = sentence.substring(s);
		System.out.println(str1);
	}

}
