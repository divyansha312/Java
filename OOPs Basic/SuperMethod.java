class Test9 {
	void m() {
		System.out.println("in class test9");
	}
}

public class SuperMethod extends Test9{
	void m() {
		System.out.println("in class supermethod");
	}
	void show() {
		super.m();
		m();
	}

	public static void main(String[] args) {
		SuperMethod obj = new SuperMethod();
		obj.show();
		
	}

}
