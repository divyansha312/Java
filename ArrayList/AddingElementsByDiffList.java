import java.util.ArrayList;
public class AddingElementsByDiffList {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		System.out.println("List before adding elements:: "+list);
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		System.out.println("List after adding elements:: "+list);
		
		ArrayList<String> list1= new ArrayList<>();
		// adding the elements of list1 to list
		list1.add("Grapes");
		list1.add("PineApple");
		System.out.println("List1 after adding elements:: "+list1);
		list.addAll(list1);  //add all for adding all elements
		System.out.println("List after adding all elements of list1 to list:: "+list);
		
		ArrayList<String> list2= new ArrayList<>();
		// adding elements to list1 at specified position
		list2.add("Date");
		list2.add("Plum");
		list.addAll(1, list2);
		System.out.println("List after adding all elements of list2 to list:: "+list);
		
	}
}
