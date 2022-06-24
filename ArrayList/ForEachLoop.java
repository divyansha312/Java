import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(4);
		for(Integer a:list) {
			System.out.println(a);
		}

	}

}
