import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DurationBwTwoDates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int yearfir;
		int monthfir;
		int datefir;
		int yearsec;
		int monthsec;
		int datesec;
		System.out.println("Enter year of first date");
		yearfir=sc.nextInt();
		System.out.println("Enter Month of first date");
		monthfir=sc.nextInt();
		System.out.println("Enter Date of first date");
		datefir=sc.nextInt();
		System.out.println("Enter year of second date");
		yearsec=sc.nextInt();
		System.out.println("Enter Month of second date");
		monthsec=sc.nextInt();
		System.out.println("Enter Date of second date");
		datesec=sc.nextInt();
		LocalDate pdatefir=LocalDate.of(yearfir,monthfir,datefir);
		LocalDate pdatesec=LocalDate.of(yearsec,monthsec,datesec);
		
		Period diff=Period.between(pdatefir,pdatesec);
		
		System.out.printf("Difference is %d years,%d month,%d days old\n\n",diff.getYears(),diff.getMonths(),diff.getDays() );


	}

}
