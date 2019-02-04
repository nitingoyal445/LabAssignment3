import java.util.Scanner;
public class PositiveString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=1;
		System.out.println("Enter String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					flag=0;
					break;
				}
				}
		}
		if(flag==1) {
			System.out.println("String is positive");
		}
		else
			System.out.println("String is Negative");

	}

}
