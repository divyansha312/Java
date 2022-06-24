import java.util.ArrayList;

public class AddElement {

	public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println("The size of list before is:: "+list.size());
     list.add(3);
     list.add(8);
     list.add(9);
     list.add(5);
     System.out.println("The size of list after is:: "+list.size());
     System.out.println("The array elements are:: "+list.toString());
	}

}
