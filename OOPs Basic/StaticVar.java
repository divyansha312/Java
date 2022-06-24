class Test15{
	static int a=8;
}
public class StaticVar {
	void run() {
         int b=0;    //static cannot be given to local-variable
	}

	public static void main(String[] args) {
		System.out.println(Test15.a);

	}

}
