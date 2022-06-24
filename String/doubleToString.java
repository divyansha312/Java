//converting float to string

import java.util.Scanner;
public class doubleToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
	  double x =sc.nextDouble();
		String st=Double.toString(x);
		System.out.println("The value of x is "+ st);
		sc.close();
		

	}

}

