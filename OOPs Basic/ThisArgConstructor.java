class Test7{
	
	Test7(ThisArgConstructor i){
		System.out.println("good");
	}
	
}

public class ThisArgConstructor {
	void n() {
		
		Test7 t= new Test7(this);
	}

	public static void main(String[] args) {
		ThisArgConstructor obj = new ThisArgConstructor();
		obj.n();
	}
}
