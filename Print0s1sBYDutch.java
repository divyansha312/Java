import java.util.Scanner;

public class Print0s1sBYDutch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array::");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemenmts of array::");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		print0s1s2s(arr,n);

	}

	public static void print0s1s2s(int[] arr, int n) {
		int l=0,m=0,h=arr.length-1,temp;
		while(m<=h) {
			switch(arr[m]) {
			case 0:{
				temp=arr[m];
				arr[m]=arr[l];
				arr[l]=temp;
				m++;
				l++;
				break;
			}
			case 1:{
				m++;
				break;
				
			}
			case 2:{
				temp=arr[m];
				arr[m]=arr[h];
				arr[h]=temp;
				h--;
				break;
			}
			}
		}
		for( int a:arr) {
		System.out.println(a);
		}
		
	}

}
