import java.util.ArrayList;

public class IsEmpty {

	public static void main(String[] args) {
   ArrayList<String> list =new  ArrayList();
   System.out.println("Before Insertion:: "+list.isEmpty());
   list.add("Good");
   list.add("Bad");
   System.out.println("After Insertion:: "+list.isEmpty());

 
	}

}
