//converting string to int
import java.util.Scanner;
public class StringToInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string::");
		String st = sc.next();
		int x = Integer.parseInt(st);
		System.out.println("The value of x is :: "+x);
		sc.close();
	
		
		

	}

}
