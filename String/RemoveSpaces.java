import java.util.Scanner;

public class RemoveSpaces {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int len=str.length();
		char[] str1= new char[len];
		for(int i =0,j=0;j<len;j++){
			if(str.charAt(j)!=' ') {
				str1[i]=str.charAt(j);
				i++;
			 }
		   }
		System.out.println("String after removing white spaces::");
		for(int i=0;i<len;i++) {
			System.out.print(str1[i]);
			
		}
	 }
}
