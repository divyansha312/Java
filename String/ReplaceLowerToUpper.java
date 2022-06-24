//WAP to replace upper to lower and vice versa
import java.util.Scanner;

public class ReplaceLowerToUpper {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		StringBuilder str1 = new StringBuilder(str);
		for(int i=0;i<len;i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') 
				str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
				
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			
		}
		
		System.out.println("String after conversion is "+str1);
		


	}

}
