class parent2 {
	
	parent2(){
		System.out.println("parent class constructor is called");
	}
	
	{
		System.out.println("Instance Intialiser block of parent is called");
	}
}
public class InstanceBlock_ex3 extends parent2 {
	InstanceBlock_ex3(){
		System.out.println("child class constructor is called");
	}
	
	{
		System.out.println("Instance Intialiser block of child is called");
	}
	
	public static void main(String[] args) {
		InstanceBlock_ex3 obj = new InstanceBlock_ex3();

	}

}
