//WAP to check whether the strings are anagram or not

import java.util.Scanner;

public class AnagramOrNot {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1st");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the String 2nd");
		String s2 = sc.nextLine();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Strings are not Anagram");
		}
		
		else {
			char[] str1 = s1.toCharArray();
			for(int i=0;i<s2.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(str1[i]==s2.charAt(j)) {
						count++;
					}
				}
				
				
			}
			
			if(count==s2.length())
				System.out.println("Strings are Anagram");
			else 
				System.out.println("Strings are not Anagram");
			
		}
	}

}
