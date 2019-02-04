import java.time.*;
import java.util.*;
public class DurationOfDates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		int month;
		int date;
		System.out.println("Enter year");
		year=sc.nextInt();
		System.out.println("Enter Month");
		month=sc.nextInt();
		System.out.println("Enter Date");
		date=sc.nextInt();
		LocalDate pdate=LocalDate.of(year,month,date);
		LocalDate now=LocalDate.now();
		
		Period diff=Period.between(pdate,now);
		
		System.out.printf("Difference is %d years,%d month,%d days old\n\n",diff.getYears(),diff.getMonths(),diff.getDays() );

	}

}
