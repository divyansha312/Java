import java.util.Scanner;

public class CharToString {

	public static void main(String[] args) {
		System.out.println("Enter a character::");
		Scanner sc = new Scanner(System.in);
		char c= sc.next().charAt(0);
		String st = Character.toString(c);
		System.out.println("The value is::" +st);
		

	}

}
