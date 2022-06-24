interface Phone{
	void call();
	void camera();
	void google();
	void calculator();
	
}


public class MobilePhone implements Phone{
	public void call() {
		System.out.println("calling.....");
	}
	public void camera() {
		System.out.println("click...click...");
	}
	public void google() {
		System.out.println("fuck you google");
	}
	public void calculator() {
		System.out.println("hello welcome to calculator.....");
	}
	public static void main(String[] args) {
		Phone p = new MobilePhone();
		
		p.call();
		p.calculator();

	}

}
