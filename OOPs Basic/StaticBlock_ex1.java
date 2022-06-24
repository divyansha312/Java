
public class StaticBlock_ex1 {
	static int i=10;
 static {
	 System.out.println("hello i am static1");
	 
 }
	public static void main(String[] args) {
		System.out.println("hello i am main");

	}
	static {
		System.out.println(i);
		 System.out.println("hello i am static2");
	 }
	

}
