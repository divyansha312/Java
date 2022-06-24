//converting int to string

import java.util.Scanner;
public class inTostring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
		int x = sc.nextInt();
		String st=Integer.toString(x);
		System.out.println("The value of x is "+ st);
		sc.close();
		

	}

}
