final class Test12{
	void run() {
		System.out.println("running");
	}
}
public class FinalClass {    //extends Test12 

	public static void main(String[] args) {
		Test12 obj = new Test12();
		obj.run();
	}

}
