import java.util.ArrayList;

public class ObjectType {

	public static void main(String[] args) {
     ArrayList list = new ArrayList<>(); // this is object class type list
     list.add(6);
     list.add(9.7);
     list.add("hello");
     list.add(true);
     
     for(Object st : list) {
    	 System.out.println(st+"\t");
     }
	}

}
