import java.time.LocalTime;
public class TimeExample1 
{

	public static void main(String[] args) 
	{
		// current time
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		//specific time
		LocalTime localTime2=LocalTime.of(4,30,45);
		System.out.println(localTime2);
		System.out.println("Hour : "+localTime.getHour());
		System.out.println("Minute :"+localTime.getMinute());
		System.out.println("Second :"+localTime.getSecond());
		
		//localTime plus methods
		System.out.println("Addition of hours :"+localTime.plusHours(2));
		System.out.println("Addition of minutes :"+localTime.plusMinutes(25));
		System.out.println("Addition of seconds :"+localTime.plusSeconds(30));
		System.out.println("Addition of Nanos :"+localTime.plusNanos(60000));
		
		//localTime minus methods
		System.out.println("subtraction of hours :"+localTime.minusHours(2));
		System.out.println("subtraction of minutes :"+localTime.minusMinutes(25));
		System.out.println("subtraction of seconds :"+localTime.minusSeconds(30));
		System.out.println("subtraction of Nanos :"+localTime.minusNanos(60000));

                LocalTime localTime3=LocalTime.of(11, 45, 20);
       	         //compare to example
        	if(localTime.compareTo(localTime2)==0)
       	        {
        		System.out.println("localTime1 and localTime2 are equal");
        	}else
        	{
    	   	 	System.out.println("localTime1 and localTime2 are not equal");
        	}
       
       	        //isBefore() example
        	if(localTime2.isBefore(localTime3))
        	{
    	    	       System.out.println("localTime2 comes  before localTime3");
        	}
        	//is after example
        	if(localTime3.isBefore(localTime))
       	        {
    	       	      System.out.println("localTime3 comes after localTime1");
                }
	}
}
