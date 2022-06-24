import java.util.ArrayList;
import java.util.Iterator;

public class UpdateOneByOther {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		 
		Iterator<String> it = list.iterator();
		System.out.println("Elements are::");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.set(3, "Grapes");
		System.out.println(list);
		
	}

}
