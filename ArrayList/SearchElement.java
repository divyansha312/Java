//to found the element

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SearchElement {
		public static void main(String[] args) {
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    list.add(99);
		    list.add(87);
		    list.add(65);
		    list.add(54);
		    list.add(41);
		    Iterator<Integer> it = list.iterator();	
		    System.out.println("Elements are::");
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the element you want to serach for::");
		    int x= sc.nextInt();
		    if(list.contains(x)) 
		    	System.out.println("Found element");
		    else 
		    	System.out.println("Sorry! element is not present");
		    
		    
		}    
}
