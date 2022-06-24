
public class StringEqualsTo {

	public static void main(String[] args) {
    String s1 = "hello";
    String s2 ="Hello";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    
    String sb = new String("divya");
    String sb1 = new String("divya");
    
    System.out.println(sb.equals(sb1));
    
	}

}
