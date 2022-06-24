class Test17{
	int count=0;
	Test17(){
		count++;
		System.out.println(count);
	}
}
public class CountVarNonStatic {

	public static void main(String[] args) {
		Test17 obj1 = new Test17();
		Test17 obj2 = new Test17();
		Test17 obj3 = new Test17();
		Test17 obj4 = new Test17();

	}

}
