import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RetrieveElement {
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(99);
	    list.add(87);
	    list.add(65);
	    list.add(54);
	    list.add(41);
	    Iterator<Integer> it = list.iterator();	
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the position you want::");
	    int i = sc.nextInt();
	    if(i>=list.size()) 
	    	System.out.println("Index is out of bound");
	    else
	    System.out.println("Element at "+i+" position is::"+list.get(i));
	    
	    
	}
}
