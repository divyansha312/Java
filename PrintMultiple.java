import java.util.Scanner;

public class PrintMultiple{
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
				int mul=1;
				System.out.println("Two multiple of "+arr[i]+" are::");
				int count=0;
				for(int j=1;;j++) {
					mul=arr[i]*j;
						count++;
						System.out.println(mul);
						if(count==2) {
							break;
						}
				}
				
			}
			
		}
	}	

