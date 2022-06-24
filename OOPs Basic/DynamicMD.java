class Phone1 {
	void on() {
		System.out.println("system is on");
	}
		
	void time() {
		System.out.println("Time is this");
	}
}

class SmartPhone extends Phone1 {
	void on() {
		System.out.println("system is on");
	}
	void music() {
		System.out.println("sa..re..ga...ma..pa..dha..ne..sa..");
	}
}

public class DynamicMD {

	public static void main(String[] args) {
		Phone1 obj = new SmartPhone();
		obj.time();
		obj.on();
		//obj.music(); not allowed

	}

}
