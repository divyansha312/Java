import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int count=0;
		String numS = Integer.toString(num);
		if(num<0) {
			count=numS.length()-1;
		}
		else
			count=numS.length();
		System.out.println("Total digits are::"+count);
    sc.close();
	}

}
