import java.util.Scanner;

public class CharDigit {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character value");
	char ch = sc.next().charAt(0);
	if(Character.isDigit(ch)) {
		System.out.println("Character is a digit");
	}
	else {
		System.out.println("Character is not a digit");
	}
	sc.close();
	}

}

