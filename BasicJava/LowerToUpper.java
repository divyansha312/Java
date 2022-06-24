import java.util.Scanner;
public class LowerToUpper {
	public static void main(String[] args) {
		System.out.println("Enter a character value::");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		char lwr=Character.toLowerCase(ch);
		System.out.println(lwr);
		char upr = Character.toUpperCase(ch);
		System.out.println(upr);
		
		sc.close();
	}

}
