//count each character except space

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		int i,count=0;
		Scanner sc = new Scanner(System.in);
		 String s1 = sc.nextLine();
		 for(i=0;i<s1.length();i++) {
			 if(s1.charAt(i)!=' ')
				 count++; 
		 }
		 System.out.println("Total characters are " +count);
		 
		 

	}

}
