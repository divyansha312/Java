
 abstract class Vehicle{
	abstract void run();
}
 class car extends Vehicle{
	 void run() {
		 System.out.println("Starts with key");
	 }
 }
 class bike extends Vehicle{
	 void run() {
		 System.out.println("Starts with kick");
	 }
 }
 
public class Abstract {

	public static void main(String[] args) {
		Vehicle obj = new car();
		obj.run();
		Vehicle obj1 = new bike();
		obj1.run();
	}

}
