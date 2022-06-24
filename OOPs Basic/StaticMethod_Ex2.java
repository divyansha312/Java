
public class StaticMethod_Ex2 {
	static int i=9;
	static void change() {
		i=10;
	}
 static void display() {
	 System.out.println(i);
 }
	public static void main(String[] args) {
		change();
		StaticMethod_Ex2.display();
	}

}
