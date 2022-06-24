import java.util.ArrayList;
import java.util.Iterator;

public class GetterSetter {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		 
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
System.out.println("Getting element:: "+list.get(1));
list.set(1, "Grapes");

for(String st : list) {
	System.out.println(st);
}

		
	}

}
