import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CaseStudyDateTimeBookingMain 
{   
	static Scanner sc = new Scanner(System.in);
	private static int date2;
	public static void main(String [] arg) throws ParseException
	{
		int id;
		String name,address,mob,pt,pno,ac,cot,cable,wifi,laundry,dates;
		int op2,date=0;
		int r=0,b=0,rid=1001,bid=2001,roomid=201;
		int d1,d2;
		Date date1;
		CaseStudyDateTimeDisplay re[]=new CaseStudyDateTimeDisplay [20];
		CaseStudyDateTimeBooking bo[]=new CaseStudyDateTimeBooking[20];
	    String op;
		do
		{
			System.out.println("Select your Needs\n1.Booking\n2.View Booking\n3.Exit\n---->");
			op2 = sc.nextInt();
			switch(op2)
			{
			case 1:System.out.println("Registration \n");
				   System.out.println("Enter personal details");
				   System.out.println("->Enter Name : ");
				   sc.nextLine();
				   name=sc.nextLine();
				   System.out.println("->Enter Address : ");
				   address=sc.nextLine();
				   System.out.println("->Enter Mobile Number : ");
				   mob=sc.nextLine();
				   System.out.println("->Enter ID-Proof Type : ");
				   pt=sc.nextLine();
				   System.out.println("->Enter ID-Proof Number : ");
				   pno=sc.nextLine();
				   re[r]=new CaseStudyDateTimeDisplay();
				   int reid=re[r].registration(rid,name,address,mob,pt,pno);
				   rid++;
				   re[r].display();
				   do
				   {
					   System.out.println("Please choose the services required\n.AC/non-AC (Enter AC/nAC) :");
					   ac=sc.next();
					   System.out.println(".Cot(Enter Single/Double) :");
					   cot=sc.next();
					   System.out.println(".With cable connection/without cable connection(Enter C/nC) :");
					   cable=sc.next();
					   System.out.println(".Wi-Fi needed or not(Enter W/nW) :");
					   wifi=sc.next();
					   System.out.println(".Laundry service needed or not(Enter L/nL) :");
					   laundry=sc.next();
					   System.out.println(".Enter Booking date(dd-mm-yyyy):");
					   dates=sc.next();
					   DateTimeFormatter dateFormatter4=DateTimeFormatter.ofPattern("dd-LL-yyyy");
					   LocalDate date2=LocalDate.parse(dates,dateFormatter4);
					   bo[b]=new CaseStudyDateTimeBooking();
					   int bbid=bo[b].book(ac, cot, cable, wifi, laundry,date2,roomid,reid);
					   b++;
					   roomid++;
					   System.out.println("Do you want to Book more Rooms(Yes/No):");
					   op=sc.next();
					   }while(op.equals("yes")||op.equals("Yes")||op.contentEquals("YES"));
				   	   break;
		  case 2:System.out.println("Enter Start Date:");
		  		 String s=sc.next();
		  		 DateTimeFormatter dateFormatter5=DateTimeFormatter.ofPattern("dd-LL-yyyy");
		  		 LocalDate sdate=LocalDate.parse(s,dateFormatter5);
		  		 System.out.println("Enter End Date:");
		  		 String s1=sc.next();
		  		 DateTimeFormatter dateFormatter6=DateTimeFormatter.ofPattern("dd-LL-yyyy");
		  		 LocalDate edate=LocalDate.parse(s1,dateFormatter6);
		  		 System.out.println("            BOOKING DETAILS\n-----------------------------");
		  		 System.out.println("Room Number\tBooking Date\tCustomer id");
		  		 for(int j=0;j<b;j++)
		  		 {
		  			 if((bo[j].date2.isAfter(sdate))&&(bo[j].date2.isBefore(edate)))
		  			 {
		  				 bo[j].view(sdate,edate);
		  			 }
		  		 }
		  		 break;
	     case 3:System.exit(0);
	     }
		 System.out.println("Do you want to proceed?(yes/no)");
		 op=sc.next();
		}while(op.contentEquals("yes")||op.contentEquals("YES")||op.contentEquals("Yes"));
	}
}


