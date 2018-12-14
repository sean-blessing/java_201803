import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FunWithJavaDatesApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate = "+ld);
		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime = "+lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime = "+ldt);
		System.out.println("\nParse Examples");
		LocalDate ld1 = LocalDate.parse("2018-12-25");
		System.out.println("ld1 = "+ld1);
		System.out.println("\nOf examples");
		
		LocalDate ld2 = LocalDate.of(2018, 12, 31);
		System.out.println("ld2 = "+ld2);
		System.out.println("ld2.dayOfMonth() = "+ld2.getDayOfMonth());
		
		System.out.println("/nComparison methods");
		System.out.println("Christmas before New Years? :"+ld1.isBefore(ld2));
		System.out.println("compare Christmas to New Years:  "+ld1.compareTo(ld2));
		
		System.out.println("\n DateTimeFormatter examples");
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("formatted Christmas: "+formatter.format(ld1));
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("formatted Christmas - Full = "+formatter2.format(ld1));
		
		System.out.println("Bye");
	}

}
