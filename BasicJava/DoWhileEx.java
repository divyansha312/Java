import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want");
		int n= sc.nextInt();
		int i=1;
		do {
			System.out.println(i);
			i++;
			
		}
		while(i<=n);
	}

}
