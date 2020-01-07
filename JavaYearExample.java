import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JavaYearExample 
{

	public static void main(String[] args)
	{
		Year y1=Year.now();//current year
		System.out.println(y1);
		Year y2=Year.of(2020);
		LocalDate l=y2.atDay(100);//current local date
		System.out.println(l);
		System.out.println(y2.length());//length of year
		System.out.println(y2.isLeap());//is leap year or not
		YearMonth ym=YearMonth.now();//current year and month
		System.out.println(ym);
		String s=ym.format(DateTimeFormatter.ofPattern("MM yyy"));//return month and year
		System.out.println(s);
		long l1=ym.getLong(ChronoField.YEAR);//return current year
		System.out.println(l1);
		long l2=ym.getLong(ChronoField.MONTH_OF_YEAR);//current month
		System.out.println(l2);
		YearMonth ym2=ym.plus(Period.ofYears(2));//adding a period of year to current year
		System.out.println(ym2);
		YearMonth ym3=ym.minus(Period.ofYears(2));//subtracting period of year from current year
		System.out.println(ym3);
		
	}

}
