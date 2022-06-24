import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Grapes");
		System.out.println("List1 elements before swap::"+list);
		Collections.swap(list, 0, 3);
		System.out.println("List1 elements after swap::"+list);

	}
}
