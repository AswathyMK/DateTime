import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;
public class JavaZoneIdExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zoneid1=ZoneId.of("Asia/Kolkata");//Get id of given time zone
		ZoneId zoneid2=ZoneId.of("Asia/Tokyo");
		LocalTime id1=LocalTime.now(zoneid1);//Get time of given Time zone id
		LocalTime id2=LocalTime.now(zoneid2);
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id1.isBefore(id2));//checks first id is before second
		ZoneId zone=ZoneId.systemDefault();//current Time zone id of system
		System.out.println(zone);
		String s=zone.getId();
		System.out.println(s);
		System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT));//return name of current Time zone id.Here it is Indian time
		
		
		
		
		

	}

}
