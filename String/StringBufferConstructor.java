
public class StringBufferConstructor {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity()); 
		
		StringBuffer s1 = new StringBuffer("divya");
		System.out.println(s1.capacity());   //16+ string length
		
		StringBuffer s2 = new StringBuffer(1000);
		System.out.println(s2.capacity()); 

	}

}
