import java.util.Scanner;

public class ReverseByConvertingString {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number::");
		  int num = sc.nextInt();
		  System.out.println("Original number is::"+num);
		  String st =Integer.toString(num);
		  String rev="";
		  for(int i=st.length()-1;i>=0;i--) {
			  rev=rev+st.charAt(i);
		  }
		  int n = Integer.parseInt(rev);
		  System.out.println("Reverse number is::"+n);
		  sc.close();
	}
}
