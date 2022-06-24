import java.util.Scanner;

public class CharWhiteSpace {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character value::");
	char ch = sc.next().charAt(0);
	if(Character.isWhitespace(ch)) {
		System.out.println(" The Character is WhiteSpace Character ");
	}
	else {
		System.out.println("The Character is not WhiteSpace Character");
	}
	System.out.println(ch);
	sc.close();
	}

}


