 class Test10{
	Test10(){
		System.out.println("i am in Test10 class");
	}
}
 class SuperConstructor  extends Test10{
	SuperConstructor(){
		System.out.println("i am in superconstructor class");
		
	}

	public static void main(String[] args) {
		SuperConstructor obj = new SuperConstructor();
		

	}

}
