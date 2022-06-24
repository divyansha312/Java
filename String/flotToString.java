//converting float to string

import java.util.Scanner;
public class flotToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
		float x = sc.nextFloat();
		String st=Float.toString(x);
		System.out.println("The value of x is "+ st);
		sc.close();
		

	}

}
