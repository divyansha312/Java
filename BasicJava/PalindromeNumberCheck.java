import java.util.Scanner;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number::");
	  int num = sc.nextInt();
	  System.out.println("Original number is::"+num);
	  int rev=0,x;
	  while(num!=0) {
		  x=num%10;
		  num=num/10;
		  rev=rev*10+x;  
	  }
	  
	  System.out.println("Reverse number is::"+rev);

	  if(num==rev)
		 System.out.println("Palindrome number");
	  
	  else
		  System.out.println("Not a Palindrome number");
	  
	  	  sc.close();

	}
}
