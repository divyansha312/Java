class Test2{
	void show() {
		System.out.println("HelloWorld");
	}
	void display() {
		System.out.println("how");
		this.show();   //show()
		System.out.println("hi");
	}
}
public class ThisMethod {
public static void main(String[] arg) {
		Test2 obj= new Test2();
		obj.display();
	}
   
}
