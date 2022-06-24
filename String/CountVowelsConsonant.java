//WAP to count vowels and consonant in a string

import java.util.Scanner;

public class CountVowelsConsonant {

	public static void main(String[] args) {
		int vCount=0, cCount=0;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')){
				vCount++;
			}
			
			else if ((s.charAt(i)>='a')&&(s.charAt(i)<='z')) {
				cCount++;
			}
		}
		
		System.out.println("Total vowels are "+vCount);
		System.out.println("Total consonants are "+cCount);

		

	}

}
