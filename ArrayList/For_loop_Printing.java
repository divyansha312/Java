import java.util.ArrayList;

public class For_loop_Printing {

	public static void main(String[] args) {
		ArrayList<Byte> list = new ArrayList<Byte>();
		list.add((byte) 2);
		list.add((byte) 8);
		list.add((byte) 4);
		list.add((byte) 7);
		list.add((byte) 9);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		

	}

}
