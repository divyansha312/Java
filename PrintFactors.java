import java.util.Scanner;

public class PrintFactors {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of Array you want::");
			int n= sc.nextInt();
			int[] arr=new int[n];
			System.out.println("Enter the elements::");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				System.out.println("Two factor of "+arr[i]+" are::");
				int count=0;
				for(int j=1;j<=arr[i];j++) {
					if(arr[i]%j==0) {
						count++;
						System.out.println(j);
						if(count==2) {
							break;
						}
					}
				}
				
			}
			
		}
	}	

