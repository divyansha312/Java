
public class StaticMethod_Ex3 {
static void display() {
	show();
	System.out.println("1");
}
static void show() {
	System.out.println("2");
}
public static void main(String[] a) {
	StaticMethod_Ex3.display();
  }

}
