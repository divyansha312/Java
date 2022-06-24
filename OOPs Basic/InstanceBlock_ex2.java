
public class InstanceBlock_ex2 {
	{
		
		System.out.println("Instance intialiser block is invoked");
	}
	InstanceBlock_ex2(){
		
		System.out.println("constructor is invoked");
	}
	public static void main(String[] args) {
		InstanceBlock_ex2 obj1 = new InstanceBlock_ex2();
	}

}
