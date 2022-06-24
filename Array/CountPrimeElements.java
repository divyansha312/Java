import java.util.Scanner;

public class CountPrimeElements {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array you want::");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements::");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int flag=0;
			for(int j=2;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					flag++;
				}
			}
			if(flag==0) {
				count++;
			}
		}
		System.out.println("Total prime elements are::"+count);
	}

}
