
public class BufferEquals {

	public static void main(String[] args) {
		
    StringBuffer sb = new StringBuffer("divya");
    StringBuffer sb1 = new StringBuffer("divya");
    System.out.println(sb.equals(sb1));// bcz stringbuffer class does not override equals method of object class string does
     
    StringBuffer sb2 = new StringBuffer("chaudhary");
    StringBuffer sb3 = sb2.append("hi");
    System.out.println(sb2.equals(sb3));
    
	}

}
