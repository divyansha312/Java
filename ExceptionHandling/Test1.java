
public class Test1 {

	public static void main(String[] args) {
		try {
			int x=5;
			int y = x/0;
		}catch(Exception e ) {
			System.out.println(e);
		};
		System.out.println("Hello");

	}

}
