import java.util.Scanner;

public class CharUpperCase {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character value");
	char ch = sc.next().charAt(0);
	if(Character.isUpperCase(ch)) {
		System.out.println("Character is Uppercase");
	}
	else {
		System.out.println("Character is not Uppercase");
	}
	sc.close();
	}

}

