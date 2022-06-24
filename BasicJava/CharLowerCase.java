import java.util.Scanner;

public class CharLowerCase{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character value");
	char ch = sc.next().charAt(0);
	if(Character.isLowerCase(ch)) {
		System.out.println("Character is Lowercase");
	}
	else {
		System.out.println("Character is not a Lowercase");
	}
	sc.close();
	}
	
}
