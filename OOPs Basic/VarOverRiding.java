
class OverRiding{
	int x = 10;
	void run() {
	System.out.println("running1....");
	}
}

class child extends OverRiding{
	//int x=10;
	int x=20;
	void run() {
		System.out.println("running2....");
		}
}

public class VarOverRiding extends OverRiding{

	public static void main(String[] args) {
		child obj = new child();
		
		System.out.println(obj.x);
		obj.run();

	}

}
