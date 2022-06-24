import java.util.Scanner;

public class FactorialOfEachElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array you want::");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements::");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int fact=1;
			for(int j=1;j<=arr[i];j++) {
			fact=fact*j;
			}
			System.out.println("Factorial of "+arr[i]+" is "+fact);
		}

		
	}	
}
