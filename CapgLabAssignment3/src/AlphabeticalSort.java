import java.util.Scanner;
import java.util.Arrays;

public class AlphabeticalSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter String");
		str=sc.nextLine();
		
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		int l=ch.length;
		if(l%2!=0) {
			int m=(l/2)+1;
			for(int i=0;i<m;i++) {
				if(ch[i]>=97 && ch[i]<=122){
					ch[i]-=32;
				}
			}
			for(int i=m;i<l;i++) {
				if(ch[i]>=65 && ch[i]<=90) {
					ch[i]+=32;
				}
			}
		}
		if(l%2==0) {
			int m=l/2;
			for(int i=0;i<m;i++) {
				if(ch[i]>=97 && ch[i]<=122){
					ch[i]-=32;
				}
			}
			for(int i=m;i<l;i++) {
				if(ch[i]>=65 && ch[i]<=90) {
					ch[i]+=32;
				}
			}
		

		}
		for(int i=0;i<l;i++) {
			System.out.println(ch[i]);
		}
}
}