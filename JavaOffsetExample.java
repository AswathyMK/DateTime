import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class JavaOffsetExample 
{

	public static void main(String[] args) 
	{
		
		OffsetTime offset=OffsetTime.now();//current time
		int h=offset.get(ChronoField.HOUR_OF_DAY);//return current hour from start of day
		System.out.println(h);
		int m=offset.get(ChronoField.MINUTE_OF_DAY);//return current minute from start of day
		System.out.println(m);
		int s=offset.get(ChronoField.SECOND_OF_DAY);//current second from start of day
		System.out.println(s);
		int h1=offset.getHour();
		System.out.println(h1+" hour");//current hour
		int m1=offset.getMinute();
		System.out.println(m1+" Minute");//current minute
		int s1=offset.getSecond();
		System.out.println(s1+" Second");//current second
	}

}
