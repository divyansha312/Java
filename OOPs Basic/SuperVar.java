
class Test8{
	Test8(){
		System.out.println("constructor of parent class");
	}
	int a=6;
}

public class SuperVar extends Test8 {
	SuperVar(){
		super();
		System.out.println("constructor of child class");
	}
    int a=8;
    void show(int a) {
    	System.out.println(a);
    	System.out.println(this.a);
    	System.out.println(super.a);
    	
    }
    
	public static void main(String[] args) {
		SuperVar obj = new SuperVar();
		obj.show(4);

	}

}
