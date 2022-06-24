import java.util.Scanner;

public class SwitchCaseCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char s = sc.next().charAt(0);
		switch(s) {
		case 'a':System.out.println("First");
		break;
		
		case 'e':System.out.println("Second");
		break;
		
		case 'i':System.out.println("Third");
		break;
		
		case 'o':System.out.println("Fourth");
		break;
		
		case 'u':System.out.println("Fifth");
		break;
		
		default:System.out.println("Consonant");
		     }
		}

}
