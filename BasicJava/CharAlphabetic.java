import java.util.Scanner;

public class CharAlphabetic {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character value");
	char ch = sc.next().charAt(0);
	if(Character.isAlphabetic(ch)) {
		System.out.println("Character is Alphabet");
	}
	else {
		System.out.println("Character is not Alphabet");
	}
	sc.close();
	}

}
