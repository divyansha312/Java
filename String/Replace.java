
public class Replace {

	public static void main(String[] args) {
         String s1 = "This is very good ";
         System.out.println(s1.replace("is" , "was"));
         System.out.println(s1.replaceFirst("is", "was"));
         System.out.println(s1.replaceAll("is(.)","was"));  //regex use here
         System.out.println(s1.replaceAll("is(.*)","was"));
	}

}
