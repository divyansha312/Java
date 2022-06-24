import java.util.Scanner;

public class SumElements {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size you want");
		int n = sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the elements of array");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements is "+sum);
     sc.close();
	}

}
