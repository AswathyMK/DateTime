import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.ChronoField;
public class JavaZoneOffsetExample 
{

	public static void main(String[] args) 
	{
		ZoneOffset zone1=ZoneOffset.UTC;
		Temporal temp=zone1.adjustInto(ZonedDateTime.now());//Get current Date,time and Time Zone
		System.out.println(temp);
		ZoneOffset zone2=ZoneOffset.ofHours(5);//Obtains an instance of ZoneOffset using an offset in hours.
		System.out.println(zone2);
		ZoneOffset zone3=ZoneOffset.ofHoursMinutes(5,30);//Obtains an instance of ZoneOffset using an offset in hours and minutes. 
		System.out.println(zone3);
		boolean b1=zone1.isSupported(ChronoField.OFFSET_SECONDS);//Checks if the specified field is supported. The offset from UTC/Greenwich. 
		System.out.println(b1);
		boolean b2=zone1.isSupported(ChronoField.SECOND_OF_MINUTE);//The second-of-minute. 
		System.out.println(b2);

	}

}
