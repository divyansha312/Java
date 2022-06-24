class Test11{
	final void show() {
		System.out.println("hello1");
	}
	
}
public class FinalMethod extends Test11 {
	/*
	 * void show() { System.out.println("hello"); }
	 */	
	void run() {
		System.out.println("running");
	}
	public static void main(String[] args) {
    FinalMethod obj = new FinalMethod();
    obj.show();
    obj.run();
	}

}
