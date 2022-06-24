import java.util.ArrayList;

public class RemovingByDiff {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		System.out.println("List after adding elements:: "+list);
		//removing by object
		list.remove("Orange");
		System.out.println("List after removing by object element:: "+list);
		//removing by index
		list.remove(0);
		System.out.println("List after removing by position elements:: "+list);
		
		//creating new list1
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Fig");
		list1.add("Peach");
		//adding elements of list1 to list
		list.addAll(list1);
		System.out.println("List after adding elements of list1 to list:: "+list);
		
		//removing all elements
		list.removeAll(list1);
		System.out.println("List after removing elements of list1 "+list);
		//clear all data elements
		list.clear();
		System.out.println("List after removing all elements "+list);
		




		
	}
}
