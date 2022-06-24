import java.util.ArrayList;

public class InserAtFirstPos {

	public static void main(String[] args) {
   ArrayList<Integer> list = new ArrayList();
   list.add(99);
   list.add(87);
   list.add(65);
   list.add(54);
   list.add(41);
   System.out.println("ArrayList before addition is :: "+list);
   list.add(0, 30);
   System.out.println("ArrayList after addition is :: "+list);
	}

}
