import java.util.Scanner;

public class PrintDigitsInWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number::");
		int num= sc.nextInt();
		String numS =Integer.toString(num);
		String rev="";
		
		for(int i=numS.length()-1;i>=0;i--) {
			rev = rev+numS.charAt(i);
		}
		num= Integer.parseInt(rev);
		for(;num!=0;) {
			int d= num%10;
			switch(d) {
			case 0:System.out.println("Zero");
			break;
			case 1:System.out.println("One");
			break;
			case 2:System.out.println("Two");
			break;
			case 3:System.out.println("Three");
			break;
			case 4:System.out.println("Four");
			break;
			case 5:System.out.println("Five");
			break;
			case 6:System.out.println("Six");
			break;
			case 7:System.out.println("Seven");
			break;
			case 8:System.out.println("Eight");
			break;
			case 9:System.out.println("Nine");
			break;
			default:System.out.println("Invalid Character");
			
			
			}
			num=num/10;
			
		}
		
		sc.close();
	}
}
