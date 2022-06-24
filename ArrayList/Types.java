import java.util.ArrayList;

public class Types {

	public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList list2 = new ArrayList<>(); // can take any type of input;
    list.add("Hello");
    list1.add("Hi");
    list2.add("Bye");
    list2.add(9);
    list2.add(8.96);
    System.out.println("List: "+list.toString());
    System.out.println("List1: "+list1.toString());
    System.out.println("List2: "+list2.toString());

	}

}
