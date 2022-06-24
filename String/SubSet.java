import java.util.Scanner;

public class SubSet {

	public static void main(String[] args) {
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		int len = str.length();
		String arr[] = new String[len*(len+1)/2];
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				arr[k]=str.substring(i, j+1);
				k++;
			}
		}
		System.out.println("all subsets are::");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}

	}

}
