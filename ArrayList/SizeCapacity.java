import java.awt.List;
import java.util.ArrayList;

public class SizeCapacity {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList(10);
		System.out.println(list.size());
		//Capacity represents the total number of elements the array list can contain.  10 capacity increases as the size increases
       //size represents the total number of elements present in the array  0
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		System.out.println(list);
	}

}
