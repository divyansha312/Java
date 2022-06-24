class Test3{
	
	Test3(){
		this(6);
		System.out.println("No-args constructor");
	}
	
	Test3(int x){
		
		System.out.println("Paramaterised constructor "+x);
		
		
	}
}
public class ThisConstructor1 {

	public static void main(String[] args) {
		Test3 obj = new Test3();
		
	}

}
