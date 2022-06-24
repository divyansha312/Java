class Test5{
	void m(	Test5 obj) {
		System.out.println("....abcdef....");
	}
	void n() {
		m(this);
		System.out.println("...xyz...");
	}
}

public class ThisArgument {

	public static void main(String[] args) {
	Test5 t = new Test5();
	t.n();

	}

}
