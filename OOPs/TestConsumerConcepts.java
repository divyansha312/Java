
public class TestConsumerConcepts {

	public static void main(String[] args) {
		 Consumer consumerOne ;   //object declaration
		 Consumer consumerTwo=null; //object definition
		 Consumer consumerThree= new Consumer(); //object instantiation
		 System.out.println(consumerThree.connectionNo);
		 //System.out.println(consumerOne.consumerName);  will give error
		 System.out.println(consumerTwo.phone); //throws exception
	     }

	}

