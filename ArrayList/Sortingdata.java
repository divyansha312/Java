import java.util.ArrayList;
import java.util.Collections;

public class Sortingdata {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Grapes");
		
		Collections.sort(list);
		
		for(String st : list) {
			System.out.println(st);
		}
		
		
		
	}

}
