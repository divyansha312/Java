//converting boolean to string

import java.util.Scanner;

public class booleanToString {
	
	public static void main(String[] a) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a boolean value:::");
	
	boolean x = sc.nextBoolean();
	
	String st = Boolean.toString(x);
	
	System.out.println("The value of x: "+st);
	
	sc.close();
	
	
	}
     
}
