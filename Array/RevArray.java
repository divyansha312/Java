import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array::");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemenmts of array::");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		revArray(arr,n);

	}
	public static void revArray(int[] arr,int n){
		int l=0,r=arr.length-1,temp;
		while(l<r) {
			temp=arr[l];
			arr[l++]=arr[r];
			arr[r--]=temp;
		}
		System.out.println("Reverse array is::");
		for(int a:arr) {
		System.out.println(a);
		}
	}

}
