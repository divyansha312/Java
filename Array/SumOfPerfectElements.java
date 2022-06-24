import java.util.Scanner;

public class SumOfPerfectElements {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int add=0;
		System.out.println("Enter the size of Array you want::");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements::");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("perfect number are::");
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=1;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					sum+=j;
				}
			}
			if(sum==arr[i]) {
				System.out.println(arr[i]);
				 add+=arr[i];
			}
			
		}
		System.out.println("Sum of perfect number is::"+add);
		
	}	
}
