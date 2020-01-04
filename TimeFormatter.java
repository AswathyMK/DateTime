import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class TimeFormatter {

	public static void main(String[] args) {
		LocalTime localTime =LocalTime.now();
		//ISO Format
		DateTimeFormatter timeFormatter =DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println(localTime.format(timeFormatter));
		
		//hours of day(0-23)
		DateTimeFormatter timeFormatter1=DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(localTime.format(timeFormatter1));
		
		//clockhour-of-am-pm (1-24)
		DateTimeFormatter timeFormatter2=DateTimeFormatter.ofPattern("kk:mm:ss");
		System.out.println(localTime.format(timeFormatter2));
		//clock -hours-of am-pm(1-12)
		DateTimeFormatter timeFormatter3=DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(localTime.format(timeFormatter3));
		
		//hour-of-am-pm(0-11)
		DateTimeFormatter timeFormatter4=DateTimeFormatter.ofPattern("KK:mm:ss a");
		System.out.println(localTime.format(timeFormatter4));
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime time1=LocalTime.now(zone1);
		System.out.println("India Time Zone :"+time1);
		LocalTime time2=LocalTime.now(zone2);
		System.out.println("Japan Time Zone :"+time2);
		
		long hours=ChronoUnit.HOURS.between(time1, time2);
		System.out.println("Hours between two time zone :"+hours);
		long minutes=ChronoUnit.MINUTES.between(time1, time2);
		System.out.println("Minutes between two time zone :"+minutes);
		long seconds=ChronoUnit.SECONDS.between(time1, time2);
		System.out.println("Seconds between two time zone :"+seconds);
		
		
		
		
		
		
	}

}
