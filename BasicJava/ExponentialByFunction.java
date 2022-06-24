import java.util.Scanner;

public class ExponentialByFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number::");
		int num= sc.nextInt();
		
		System.out.println("Enter its power::");
		int pow=sc.nextInt();
		 
		double ex =Math.pow(num, pow);
		System.out.println("The exponetial is::"+ex);
		sc.close();
		
	}
}
