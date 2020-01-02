import java.time.LocalDate;
import java.time.Month;

public class DateTimeExample2
{

	public static void main(String[] args) 
	{
		
		LocalDate localDate1=LocalDate.of(1995, Month.AUGUST, 25);
		LocalDate localDate2=LocalDate.of(1997, Month.FEBRUARY, 19);
		
		//Number of days in a month
		System.out.println("Number of days in "+localDate1.getMonth()+": "+localDate1.lengthOfMonth());
		System.out.println("Number of days in "+localDate2.getMonth()+": "+localDate2.lengthOfMonth());
          
		//Number of days in a year
		System.out.println("Number of days in "+localDate1.getYear()+": "+localDate1.lengthOfYear());
		System.out.println("Number of days in "+localDate2.getYear()+": "+localDate1.lengthOfYear());
		
		if(localDate1.isLeapYear())
		{
			System.out.println(localDate1.getYear()+"is  a leap year");
		}else
		{
			System.out.println(localDate1.getYear()+"is not a leap year");
			
		}if(localDate2.isLeapYear())
		{
			System.out.println(localDate2.getYear()+"is  a leap year");
			
		}else
		{
			System.out.println(localDate2.getYear()+"is not a leap year");
			
		}


		
	}

}
