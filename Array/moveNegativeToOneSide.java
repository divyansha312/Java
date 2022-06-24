import java.util.Scanner;

public class moveNegativeToOneSide {
	public static void rearrange(int arr[],int n) {
		int temp;
	  for(int i=0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {
		  if(arr[i]>=0) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		  }
		}
	}
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]);
	  }
	  
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
			rearrange(arr,n);
			sc.close();

	}

}
