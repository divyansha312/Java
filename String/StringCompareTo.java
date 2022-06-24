
public class StringCompareTo {

	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "a";                             // if one string is empty compare to will give the length of string
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));    //   +  s1>s2 
		                                                  //    -  s1<s2
		                                                 //     0 s1==s2
	}

}
