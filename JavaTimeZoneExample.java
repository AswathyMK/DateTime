import java.util.Calendar;
import java.util.TimeZone;

public class JavaTimeZoneExample 
{

	public static void main(String[] args) 
	{
		String[] id=TimeZone.getAvailableIDs();//get available timezone
		System.out.println("In Timezone clas available Ids are :");
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		TimeZone zone=TimeZone.getTimeZone("Asia/Kolkata");
		System.out.println("The offset value of TimeZone : "+zone.getOffset(Calendar.ZONE_OFFSET));//offset value of Asia/Kolkata
		System.out.println("Value of ID is : "+zone.getID());//zone id of Asia/Kolkata
		TimeZone zone1=TimeZone.getDefault();//default timezone
		String name=zone1.getDisplayName();//name of default timezone
		System.out.println("Display name for default time zone: "+name);
	}

}
