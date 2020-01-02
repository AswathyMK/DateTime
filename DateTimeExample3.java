import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeExample3 {

	public static void main(String[] args) {
		// ISO date
		LocalDate localDate=LocalDate.now();
		DateTimeFormatter dateFormatter=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(localDate.format(dateFormatter));
		
		//yyy/MM/dd pattern
		DateTimeFormatter dateFormatter1=DateTimeFormatter.ofPattern("yyy/MM/dd");
		System.out.println(localDate.format(dateFormatter1));
		
       //MMMM dd,yyy pattern
		DateTimeFormatter dateFormatter2=DateTimeFormatter.ofPattern("MMMM dd,yyy");
		System.out.println(localDate.format(dateFormatter2));
		//dd-MMM-yyyy  pattern
		DateTimeFormatter dateFormatter3=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(localDate.format(dateFormatter3));
				
		// dd-LL-yyyy pattern
		DateTimeFormatter dateFormatter4=DateTimeFormatter.ofPattern("dd-LL-yyyy");
		System.out.println(localDate.format(dateFormatter4));
				
				
		
	}

}
