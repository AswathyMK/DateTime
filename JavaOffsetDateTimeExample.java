import java.time.OffsetDateTime;
public class JavaOffsetDateTimeExample 
{

	public static void main(String[] args) 
	{
		
		OffsetDateTime offsetDT=OffsetDateTime.now();//current date and time
		System.out.println(offsetDT.getDayOfMonth());//return current day on month
		System.out.println(offsetDT.getDayOfYear());//return current day on year
		System.out.println(offsetDT.getDayOfWeek());//return current day on week2
		System.out.println(offsetDT.toLocalDate());//return current date
		OffsetDateTime value1=offsetDT.minusDays(240);//return the date and time before specified no:of day
		System.out.println(value1);
		OffsetDateTime value2=offsetDT.plusDays(240);//return the date after specified day
		System.out.println(value2);
		}

}
