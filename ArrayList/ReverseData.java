    //ArrayList in reverse order

import java.util.ArrayList;

public class ReverseData {

	public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("abc");
    list.add("def");
    list.add("ghi");
    list.add("jkl");
    System.out.println("ArrayList in reverse order :");
    for(int i=list.size()-1;i>=0;i--) {
    	System.out.print(list.get(i)+" \t");
    }
    System.out.println("\n "+list.toString()); //but list is not permanently reversed
	}

}
