
public class RevString {
	public static void revString(String str) {
		char[] ch=str.toCharArray();
		int l=0,r=ch.length-1;
		char temp;
		while(l<r) {
			temp=ch[r];
			ch[r--]=ch[l];
			ch[l++]=temp;
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		String str="Hello";
		revString(str);
		
	}
	

}
