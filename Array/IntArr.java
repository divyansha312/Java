import java.util.Scanner;

public class IntArr {

	public static void main(String[] args) {
		Scanner sc = new 
				Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("Enter array elements::");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("The array elements are::");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\nThe length of array is::"+arr.length);
		
		sc.close();

	}

}

