
public class StringConstructor {

	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1.length());   //empty constructor
		
		String s2 = new String("divya");  //literal constructor
		System.out.println(s2);
		
//		StringBuffer sb = new StringBuffer(); 
//		String s3 = new String();
//		System.out.println(s3);
		
		byte[] b = {104,101,102};
		String s4 = new String(b);
		System.out.println(s4);
		
		char[] c = {'a','b','c'}; 
		String s5 = new String(c);
		System.out.println(s5);
		
		char[] s6 = new char[] {'a','b','c','d'};
		String s7 = new String("abcdef");
		System.out.println(s6);
		System.out.println(s7);
	
		
		
		
		
		

	}

}

