
public class InstanceBlock_ex1 {
	int speed ;
	{
		speed=9;
	}
	
	InstanceBlock_ex1(){
		System.out.println("speed is "+speed);
		
	}

	public static void main(String[] args) {
		InstanceBlock_ex1 obj1 = new InstanceBlock_ex1();
		InstanceBlock_ex1 obj2 = new InstanceBlock_ex1();
	
	}

}
