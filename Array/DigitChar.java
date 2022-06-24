import java.util.Scanner;

public class DigitChar {

	public static void main(String[] args) {
		Scanner sc = new 
				Scanner(System.in);
		char[] ch = new char[6];
		System.out.println("Enter array elements::");
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
			
		}
		
		System.out.println("The Digit array elements are::");
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i]))
			System.out.print(ch[i]+"\t");
		}
				
		sc.close();

	}

}
