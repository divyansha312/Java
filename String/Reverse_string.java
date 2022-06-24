
public class Reverse_string {

	public static void main(String[] args) {
		String s1 = "i like this program very much";
		String str[]=s1.split(" ");
		String s2=" ";
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		 System.out.println(".....after reversing.....");
		 
		 for( int i =str.length-1;i>=0;i--) {
			 s2 = s2 + str[i] + " ";
			 
		 }
		 System.out.print(s2);

	}

}
