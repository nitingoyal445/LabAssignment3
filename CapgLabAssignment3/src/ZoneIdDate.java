import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;
import java.util.Scanner;
public class ZoneIdDate {

	public static void main(String[] args) {
		Date today = new Date();
	    DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Zone ID");
	    String str=sc.nextLine();
        df.setTimeZone(TimeZone.getTimeZone(str));
        String DateTime = df.format(today);
        System.out.println("Date and Time : " + DateTime);
      
  
  
    } 
  
}
