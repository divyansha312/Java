import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PrintByListIterator {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		
		System.out.println("In forward direction::");
	   Iterator<String> list1 = list.iterator();
	   while(list1.hasNext()) {
		   System.out.println(list1.next());
	   }
	   System.out.println("In reverse order::");
		//here elements iterate in reverse order
		ListIterator<String> list2 =  list.listIterator(list.size()); 
		while(list2.hasPrevious()) {
			System.out.println(list2.previous());
		}
		
	}
}
