//converting string to boolean
import java.util.Scanner;
public class StringToBoolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string::");
		String st = sc.next();
		boolean x= Boolean.parseBoolean(st);
		System.out.println("The value of x is :: "+x);
		sc.close();
	
		
		

	}

}

