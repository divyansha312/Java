import java.util.Scanner;
public class maxmin{
	public static int maximum(int arr[],int n) {
		if(arr==null&&arr.length==0)
			return 0;
		int maximum=arr[0];
		if(arr.length==1) {
			return maximum;
		}
		else {
			for(int i=0;i<n;i++) {
			if(arr[i]>maximum) {
				maximum=arr[i];
			}
		  }	
		}
		return maximum;
	}
	public static int minimum(int arr[],int n) {
		if(arr==null&&arr.length==0)
			return 0;
		int minimum=arr[0];
		if(arr.length==1) {
			return minimum;
		}
		else {
			for(int i=0;i<n;i++) {
			if(arr[i]<minimum) {
				minimum=arr[i];
			}
		  }	
		}
		return minimum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array you want::");
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		System.out.println("enter the elements of array::");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=maximum(arr,n );
		int min=minimum(arr,n );
		System.out.println("maximum value is::"+max);
		System.out.println("minimum value is::"+min);
		
	}
	
}