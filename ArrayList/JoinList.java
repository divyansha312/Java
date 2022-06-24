import java.util.ArrayList;


public class JoinList {
	public static void main(String[] a) {
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
	System.out.println("List2 elements::"+list2);
	list.addAll(list2);
	System.out.println(list);
	
   }
}
