class Test1 {
	int i;
    Test1(int i){
		this.i=i;
		
	}
}
public class WithThis {
	public static void main(String[] args) {
Test1 obj = new Test1(8);

System.out.println(obj.i);
	}
}

