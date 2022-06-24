//WAP to input an array of 5 elements and print it in reverse order
import java.util.Scanner;

public class ArrReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    byte[] arr = new byte[5];
		System.out.println("Enter the elements::");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextByte();
		}
		System.out.println("Elements in reverse order are::");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ "\t");
		}
		
		sc.close();

	}

}
