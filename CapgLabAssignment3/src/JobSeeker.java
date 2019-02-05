import java.util.Scanner;
public class JobSeeker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter gender");
		String gen=sc.nextLine();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Username");
		String userName=sc.next();
		
		System.out.println(validateUserName(userName));

	}
	
	private static String validateUserName(String userName){
		
		char[] ch=userName.toCharArray();
		if(ch.length<12 && ch.length-1!='j' && ch.length-2!='o' && ch.length-3!='b')
		return "False";
		else
			return "True";
	}

}
