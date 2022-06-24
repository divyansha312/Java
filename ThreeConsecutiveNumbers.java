import java.util.Scanner;

public class ThreeConsecutiveNumbers {
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
		
		for(int i=0;i<n;i++) {
			int temp,count=0;
			System.out.println("Three consecutive numbers of "+arr[i]+" are ::");
			for(int j=1;;j++) {
				count++;
				temp=++arr[i];
				System.out.println(temp);
				if(count==3)
					break;
			}
			
			
		}
		

	}	
}
