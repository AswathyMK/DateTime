import java.time.LocalDate;
import java.time.Month;

public class DateTimeExample
{

	public static void main(String[] args) 
	{
		//current Date
		LocalDate localDate=LocalDate.now();
		System.out.println("Today's Date is :"+localDate);
		
		//specific date
		LocalDate localDate2=LocalDate.of(1997, Month.FEBRUARY, 19);
		System.out.println(localDate2);
		LocalDate localDate3=LocalDate.of(1995, Month.AUGUST, 25);
		System.out.println(localDate3);
		
		System.out.println("Year :"+localDate.getYear());
		System.out.println("Month :"+localDate.getMonth().getValue());
		System.out.println("Day of month :"+localDate.getDayOfMonth());
		System.out.println("Day of week:"+localDate.getDayOfWeek());
		System.out.println("Day of Year :"+localDate.getDayOfYear());
		
		//local date's plus method
		System.out.println("Addition of days :"+localDate.plusDays(5));
		System.out.println("Addition of Months:"+localDate.plusMonths(15));
		System.out.println("Addition of weeks :"+localDate.plusWeeks(45));
		System.out.println("Addition of years :"+localDate.plusYears(5));
		
		//local date's minus method
		System.out.println("Subtraction of days :"+localDate.minusDays(5));
		System.out.println("Subtraction  of Months:"+localDate.minusMonths(15));
		System.out.println("Subtraction  of weeks :"+localDate.minusWeeks(45));
		System.out.println("Subtraction  of years :"+localDate.minusYears(5));
				
       //isEqual() example
		
		if(localDate.isEqual(localDate2))
		{
			System.out.println("localDate1 and localDate2 are equal");
		}else
		{
			System.out.println("localdate1 and localDate2 are not equal");
		}
		//ifAfter() example
		if(localDate2.isAfter(localDate3))
		{
			System.out.println("localDate2 comes after localDate3");
		}
 
		//ifBefore() example
		if(localDate3.isBefore(localDate))
		{
			System.out.println("localDate3 comes before localDate1");
		}
	}
}
