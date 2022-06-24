import java.util.ArrayList;

public class CopyManually {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Mango");
		System.out.println("List1 elements::"+list1);
		ArrayList<String> list2= new ArrayList<>();
		
		list2.add("Fig");
		list2.add("Plum");
		list2.add("Peach");
		list2.add("PineApple");
		System.out.println("List2 elements::"+list2);
		//copying elements of list1 to list2
		for(int i=0;i<list1.size();i++) {
			 String temp=list2.get(i);
			list1.set(i, temp);
		}
		System.out.println("List1 elements::"+list1);
		System.out.println("List2 elements::"+list2);
		
	}
}
