import java.util.ArrayList;
import java.util.Iterator;

class RetainAll{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ajay");  
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Ravi");  
  al2.add("Hanumat");  
  al2.add("Vijay");
  al.retainAll(al2);  
  System.out.println("iterating the elements after retaining the elements of al2");  //getting common elements
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
