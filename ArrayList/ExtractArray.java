import java.util.ArrayList;
import java.util.List;

public class ExtractArray {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Mango");
		System.out.println("List1 elements::"+list1);
		List<String>sub_list;
	    sub_list= list1.subList(0, 2);
		System.out.println("Extracted string::"+sub_list);
		
		
	}
}
