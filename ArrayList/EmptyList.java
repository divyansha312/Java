import java.util.ArrayList;

public class EmptyList {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Grapes");
		list1.add("Mango");
		System.out.println("List1 elements::"+list1);
		list1.removeAll(list1);
		System.out.println("List1 elements::"+list1);

	}
}
