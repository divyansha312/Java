import java.util.ArrayList;

public class CompareList {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Grapes");
		list1.add("Mango");
		System.out.println("List1 elements::"+list1);
		ArrayList<String> list2= new ArrayList<>();
		list2.add("Apple");
		list2.add("Banana");
		list2.add("Orange");
		list2.add("Mango");
		System.out.println("List2 elements::"+list2);

		ArrayList<String> list3= new ArrayList<>();
		
		for(String st :list1) {
			if(list2.contains(st))
				list3.add("YES");
			else
				list3.add("NO");
		}

		System.out.println("List3 elements::"+list3);
		
	}
}
