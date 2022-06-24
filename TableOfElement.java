import java.util.Scanner;

public class TableOfElement {
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
		System.out.println("Table of elements are::");
		for(int j=0;j<n;j++) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d X %d = %d\n",arr[j],i,arr[j]*i);
		    }
		System.out.println("***************************");
		}
	}	
}
