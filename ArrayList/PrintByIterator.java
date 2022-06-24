import java.util.ArrayList;
import java.util.Iterator;

public class PrintByIterator {

	public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<Integer>();
     list.add(9);
     list.add(6);
     list.add(45);
     list.add(90);
    Iterator<Integer> it=list.iterator(); //interface
    while(it.hasNext())
	{
		System.out.println(it.next());
	}
    
    System.out.println(list.toString());
}

}

