class Test {
	int i;
    Test(int i){
		i=i;
		
	}
}
public class WithOutThis {
	public static void main(String[] args) {
Test obj = new Test(8);

System.out.println(obj.i);
	}
}
