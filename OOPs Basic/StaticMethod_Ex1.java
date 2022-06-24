class Test19{
	static void run() {
		System.out.println("running..");
	}
}
public class StaticMethod_Ex1 {
	static void display() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		display(); // can be called directly within the class
		Test19.run();  // cannot called directly without using class name with method name.
	}

}

