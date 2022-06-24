interface I1{
	void run();
	void display();
	
}
class walk implements I1{
	public void run() {
		System.out.println("Running...");
	}
	public void display() {
		System.out.println("hello hi");
	}
}



public class Interface_ex1 {

	public static void main(String[] args) {
		I1 obj = new walk();
		obj.run();
		obj.display();

	}

}
