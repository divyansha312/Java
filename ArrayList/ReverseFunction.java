import java.util.ArrayList;
import java.util.Collections;

public class ReverseFunction {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); //<> without this doesnot throws error
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("U");
		System.out.println("The forward list is "+list.toString());
		
		Collections.reverse(list);// reverse the list permanently
		System.out.println("The reverse list is "+list.toString());
		
		

	}

}
