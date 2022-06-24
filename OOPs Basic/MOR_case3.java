
class Test4{
	 void run() {
		System.out.println("running");
	}
}
public class MOR_case3 extends Test4 {
	
	public void run() {
		System.out.println("...running...");
	}
	
	public static void main(String[] args) {
		
			Test4 obj = new MOR_case3();
			obj.run();
		
	}

}
