//WAP to divide string into N parts

import java.util.Scanner;

public class NParts {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter how many parts you want");
		int len = str.length();
		int n = sc.nextInt();
		int chars = len/n;
		if(len%n!=0) {
			System.out.println("sorry! this string can not be divided into "+n+" equal parts");
		}
		
		else {
				for(int j=0;j<len;j=chars+j) {
					String part = str.substring(j,chars+j);
					System.out.println(part);
				}
				
		}

	}

}
