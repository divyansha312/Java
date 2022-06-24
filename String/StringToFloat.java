//converting string to int
import java.util.Scanner;
public class StringToFloat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string::");
		String st = sc.next();
		float x= Float.parseFloat(st);
		System.out.println("The value of x is :: "+x);
		sc.close();
	
		
		

	}

}

