import java.util.Scanner;

public class ExponentialPower {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number::");
			int num= sc.nextInt();
			
			System.out.println("Enter its power::");
			int pow=sc.nextInt();
			int ex=1;
			for(int i=0;i<pow;i++) {
				ex =num*ex;
			}
			System.out.println("The power is::"+ex);
			
	
			sc.close();
		}

	}

