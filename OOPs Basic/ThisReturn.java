
public class ThisReturn {
 ThisReturn m() {
	 System.out.println("this is good");
	 return this;
 }
	public static void main(String[] args) {
		ThisReturn obj = new ThisReturn();
		obj.m();
	}

}
