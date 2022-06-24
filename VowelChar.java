import java.util.Scanner;

public class VowelChar {

	public static void main(String[] args) {
		Scanner sc = new 
				Scanner(System.in);
		char[] ch = new char[6];
		System.out.println("Enter array elements::");
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
			
		}
		
		System.out.println("The Vowel array elements are::");
		for(int i=0;i<ch.length;i++) {
			if((ch[i]=='a')||(ch[i]=='A')||(ch[i]=='e')||(ch[i]=='E')||(ch[i]=='i')||(ch[i]=='I')||(ch[i]=='o')||(ch[i]=='O')||(ch[i]=='u')||(ch[i]=='U'))
			System.out.print(ch[i]+"\t");
		}
				
		sc.close();

	}

}

