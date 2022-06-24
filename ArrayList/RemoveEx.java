import java.util.ArrayList;

public class RemoveEx {

	public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<Double>();
    list.add(6.8);
    list.add(6.8);
    list.add(9.7);
    list.add(3.7);
    list.add(9.7);
    System.out.println("The array elements are:: "+list.toString());
    list.remove(new Double(9.7));
    System.out.println("The array elements are:: "+list.toString());
    
    
	}

}
