class Test16{
	int emp_id;
	String name;
	static String company="DJP";
	
	Test16(int emp_id,String name){
		this.emp_id=emp_id;
		this.name=name;
	}
	void display() {
		System.out.println(emp_id+" "+name+" "+company);
	}
}
public class StaticVar2 {

	public static void main(String[] args) {
     Test16 obj1 = new Test16(1,"Divya");
     obj1.display();
     Test16 obj2 = new Test16(1,"Pintu");
     obj2.display();
	}

}
