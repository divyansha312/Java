interface I2{
	void run();
}
interface I3{
	void run();
}

class walk1 implements I2,I3{
	public void run() {
		System.out.println("...Running hi...");
	}
	
}



public class Interface_ex2 {

	public static void main(String[] args) {
		walk1 obj = new walk1();
		obj.run();
		
		

	}

}
