class Test18{
	static int count=0;
	Test18(){
		count++;
		System.out.println(count);
	}
}
public class CountVarStatic {

	public static void main(String[] args) {
		Test18 obj1 = new Test18();
		Test18 obj2 = new Test18();
		Test18 obj3 = new Test18();
		Test18 obj4 = new Test18();

	}

}
