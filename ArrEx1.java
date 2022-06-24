import java.util.Scanner;

public class ArrEx1 {

	public static void main(String[] args) {
		Scanner sc = new 
				Scanner(System.in);
		float[] arr = new float[6];
		System.out.println("Enter array elements::");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextFloat();
			
		}
		
		System.out.println("The array elements are::");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\nThe length of array is::"+arr.length);
		
		sc.close();

	}

}
