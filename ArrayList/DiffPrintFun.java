import java.util.ArrayList;

public class  DiffPrintFun {

	public static void main(String[] args) {
    ArrayList<String> var = new ArrayList<String>();
    var.add("Hello");
    var.add("How");
    var.add("Are");
    var.add("You");
    System.out.println("The arraylist is : "+var.toString());
    
    for(String st : var) {
    	System.out.print(st+"\t");
       }
     System.out.println();
     
    for(int i=0;i<var.size();i++) {
    	System.out.println(var.get(i));
    }
    
	}

}
