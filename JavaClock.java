import java.time.Clock;
import java.time.Duration;
public class JavaClock
{

	public static void main(String[] args) 
	{
		Clock c1=Clock.systemDefaultZone();//current Time Zone
		System.out.println(c1.getZone());
		Clock c2=Clock.systemUTC();//current universal time coordinator
		System.out.println(c2.instant());//Time obtained by GMT(based on UK time)
		Duration d=Duration.ofHours(5);
		Clock clock=Clock.offset(c2, d);//add 5 hours to UTC
		System.out.println(clock.instant());

	}

}
