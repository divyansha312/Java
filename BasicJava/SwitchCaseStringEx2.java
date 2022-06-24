import java.util.Scanner;

public class SwitchCaseStringEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String st = sc.next();
		switch(st) {
		case "hello":System.out.println("First");
		
		
		case "how":System.out.println("Second");
		
		
		case "hey":System.out.println("Third");
		
		default:System.out.println("Other");
		     }
		}
}
