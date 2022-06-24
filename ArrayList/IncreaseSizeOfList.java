import java.util.ArrayList;

public class IncreaseSizeOfList {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>(4);
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Mango");
		System.out.println("List1 elements::"+list1);
		list1.ensureCapacity(6);
		list1.add("Fig");
		list1.add("Plum");
		System.out.println(list1);
		
	}
}
