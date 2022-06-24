import java.util.ArrayList;
import java.util.List;

public class Book {
	int id;
	String bookName;
	String publisher;
	int quantity;
	
	
	Book(int id,String bookName,String publisher,int quantity){
		this.id=id;
		this.bookName=bookName;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}

	public static void main(String[] args) {
	//creating a list
     List<Book>list= new ArrayList<>();
     
     //Creating books
     Book b1 = new Book(101,"Java","Divyansha",90);
     Book b2 =new Book(102,"C programming","Pintu",45);
     Book b3 =new Book(103,"Python","Jyoti",67);
     
     //Adding Books to list
     list.add(b1);
     list.add(b2);
     list.add(b3);
     
     //Traversing list
    for(Book b :list) {
    	System.out.println(b.id+" "+b.bookName+" "+b.publisher+" "+b.quantity);
    	//System.out.println(b); will print reference here
    }
     
	}

}
