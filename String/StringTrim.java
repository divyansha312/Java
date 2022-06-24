
public class StringTrim {
	
	public static void main(String[] a) {
		
		String s1= "   j    ";  // trim ignore the spaces of front and back
		System.out.println(s1);
		System.out.println(s1.trim());
		if(s1.trim().length()==0) {   
			System.out.println("name is empty");
		}
		
		else 
			System.out.println("name is not empty");
	}

}
