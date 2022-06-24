import java.util.ArrayList;
import java.util.Collections;

public class ShuffleList {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Mango");
		System.out.println("List1 elements before shuffling::"+list1);
		
		Collections.shuffle(list1);
		System.out.println("List1 elements after shuffling::"+list1);
	}
}
