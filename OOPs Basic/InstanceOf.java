class Demo{
	
}
public class InstanceOf extends Demo {

	public static void main(String[] args) {
       InstanceOf obj = new InstanceOf();
       InstanceOf obj1 = null;

       System.out.println(obj instanceof InstanceOf );
       System.out.println(obj1 instanceof InstanceOf);
       System.out.println(obj instanceof Demo);
       
	}

}
