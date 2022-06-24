import java.util.ArrayList;
import java.util.Scanner;

public class ScannerData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		System.out.println("Enter how many data elements you want:");
	    int n = sc.nextInt();
	    System.out.println("Enter the data");
		for(int i=0;i<n;i++) {
			list.add(sc.next());

		}
		
		System.out.println(list.toString());
		

	}

}
