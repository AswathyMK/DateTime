import java.util.Calendar;

public class JavaCalenderExample 
{

	public static void main(String[] args)
	{
		Calendar calendar=Calendar.getInstance();
		System.out.println("The current date is : "+calendar.getTime());//current date
		calendar.add(Calendar.DATE, -15);     //date after specific no:of days
		System.out.println("15 days ago: "+calendar.getTime());
		calendar.add(Calendar.MONTH, 4); //date after specific no:of months
		System.out.println("4 months later: "+calendar.getTime());
		calendar.add(Calendar.YEAR, 2);  //date after specific no:of years
		System.out.println("2 years later: "+calendar.getTime());
		System.out.println("At present caledar's Year: "+calendar.get(Calendar.YEAR));//current year
		System.out.println("At present caledar's Day: "+calendar.get(Calendar.DATE));//current date
		System.out.println("At present Date and Time is : "+calendar.getTime());//current date and time
		int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);//Maximum no:of days in week
		System.out.println("Maximum no:of days in week: "+maximum);
		maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);//maximum no:of weeks in year
		System.out.println("Maximum no:of  weeks in Year: "+maximum);
		int minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);// Minimum no:of days in week
		System.out.println("Minimum no:of days in week: "+minimum);
		minimum=calendar.getMinimum(Calendar.WEEK_OF_YEAR);//Minimum no:of weeks in year
		System.out.println("Minimum no:of  weeks in year: "+minimum);
		
	}

}
