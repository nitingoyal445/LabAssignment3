import java.time.*;
import java.util.Scanner;
public class ExpiryDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month of Purchase Date");
		int monthPur=sc.nextInt();
		System.out.println("Enter Year of Purchase Date");
		int yearPur=sc.nextInt();
		System.out.println("Enter month in warranty duration");
		int monthWar=sc.nextInt();
		System.out.println("Enter year in warranty duration");
		int yearWar=sc.nextInt();
		int expiryMonth=monthPur+monthWar;
		int expiryYear=yearPur+yearWar;
		while(expiryMonth>12) {
			expiryYear+=1;
			expiryMonth-=12;
		}
		System.out.printf("Expiry date is %d/%d ",expiryMonth,expiryYear);
	}

}
