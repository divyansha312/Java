import java.util.ArrayList;
import java.util.Collections;

public class CopyList {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		System.out.println("List1 elements::"+list);
		ArrayList<String> list2= new ArrayList<>();
		
		list2.add("Fig");
		list2.add("Plum");
		list2.add("Peach");
//		list2.add("Grapes");
		System.out.println("List2 elements::"+list2);
		//copying elements of list1 to list2
			Collections.copy(list, list2);
			 System.out.println("List1 elements::"+list);
			 System.out.println("List2 elements::"+list2);
					
		
	}	
}
