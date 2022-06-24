import java.util.ArrayList;
import java.util.List;

public class CloneCopy {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Grapes");
		list1.add("Mango");
		System.out.println("List1 elements::"+list1);
	     ArrayList<String>list2 = (ArrayList<String>) list1.clone();
		System.out.println("List2 elements::"+list2);

		
	}

}
       
