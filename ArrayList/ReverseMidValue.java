import java.util.ArrayList;
import java.util.Scanner;

public class ReverseMidValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();	
    list.add("A");
	list.add("E");
	list.add("I");
	list.add("O");
	list.add("U");
 
		int mid=list.size()/2;
		System.out.println("The forward list is: "+list.toString());
		
		for(int i=0,j=list.size()-1;i<=mid;i++,j--) {
			String temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
      System.out.println();
      System.out.println("The reverse list is: "+list.toString());
	}

}
