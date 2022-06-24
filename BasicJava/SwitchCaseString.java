import java.util.Scanner;

public class SwitchCaseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String st = sc.next();
		switch(st) {
		case "hello":System.out.println("First");
		break;
		
		case "how":System.out.println("Second");
		break;
		
		case "hey":System.out.println("Third");
		break;
		default:System.out.println("Other");
		     }
		}
	

}
