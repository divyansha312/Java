import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array you want::");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements::");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
			}
		}
		System.out.println("Sum of odd elements is::"+sum);

	}

}

