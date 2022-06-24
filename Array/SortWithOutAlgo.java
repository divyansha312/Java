import java.util.Scanner;

public class SortWithOutAlgo {

	public static void main(String[] args) {
		Scanner sc = new 
				Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("Enter array elements::");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();			
		}
		int count0=0,count1=0,count2=0,i;
		
		for( i=0;i<arr.length;i++) {
			switch(arr[i]) {
			case 0:count0++;
			break;
			case 1:count1++;
			break;
			case 2:count2++;
			break;
			}
		}
		i=0;
		while(count0>0) {
			arr[i++]=0;
			count0--;
		}
		while(count1>0) {
			arr[i++]=1;
			count1--;
		}
		while(count2>0) {
			arr[i++]=2;
			count2--;
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
