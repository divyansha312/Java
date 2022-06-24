
public class StaticMethod_Ex4 {
	int i=9;
 static void show() {
	  System.out.println(this.i); // cannot use this and super in static context
  }
	public static void main(String[] args) {
      show();
	}

}
