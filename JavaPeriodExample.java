import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class JavaPeriodExample 
{
	public static void main(String[] args) 
	{
		Period period1=Period.ofDays(24);//Obtains a Period representing a number of days. 
		Temporal temp=period1.addTo(LocalDate.now());//period of days added to current date.6 became 30
		System.out.println(temp);
		Period period2=Period.of(2020, 01, 03);//sets the second period with userdefined date
		System.out.println(period2.toString());//converts the date to strings
		Period period3=Period.ofMonths(4);//set period of month 4
		Period period4=period3.minus(Period.ofMonths(2));//from a period of month another period is subtracted
		System.out.println(period4);
		Period period5=period3.plus(Period.ofMonths(2));//to a period of month another period is added
		System.out.println(period5);
		Duration d=Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(d.get(ChronoUnit.SECONDS));
		Duration d1=Duration.between(LocalTime.MAX, LocalTime.NOON);
		System.out.println(d1.isNegative());
		Duration d2=Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(d2.isNegative());
		System.out.println(d.getSeconds());
		Duration d3=d.minus(d);
		System.out.println(d3.getSeconds());
		Duration d4=d.plus(d);
		System.out.println(d4.getSeconds());
	


		

	}

}
