import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String st =sc.next();
		System.out.println("Original string is::"+st);
		String rev ="";
		for(int i =st.length()-1;i>=0;i--) {
			rev = rev+st.charAt(i);
		}
		System.out.println("Reverse string is::"+rev);
		if(st.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else
			System.out.println("Not a Palindrome String");
        sc.close();
	}

}
