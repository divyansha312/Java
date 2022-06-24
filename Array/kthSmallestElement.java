import java.util.Scanner;

public class kthSmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array::");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemenmts of array::");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter which smallest element you want::");
		int k= sc.nextInt();
		int s =smallestElement(arr,n,k);
		System.out.println(k+" smallest elements is::"+s);

	}

	public static int smallestElement(int[] arr, int n,int k) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1) {
				break;
			}
		}
		return arr[k-1];
		
	}

}
