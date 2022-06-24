import java.util.ArrayList;

public class TrimToSize {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>(10);
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Mango");
		System.out.println("List1 elements::"+list1);
		System.out.println("Trim to size");
		list1.trimToSize();
		System.out.println(list1);
	}
}
