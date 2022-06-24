import java.util.ArrayList;
import java.util.Scanner;

public class TestConsumerArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Consumer> consumerList = new ArrayList<Consumer>();
        Consumer consumer1=new Consumer();
        consumer1.connectionNo="123456";
        consumer1.consumerName="Divya";
        consumer1.phone="768668";
        consumer1.sal="3565";
        consumerList.add(consumer1);
        Consumer consumer2=new Consumer();
        
        consumer2.connectionNo="1456";
        consumer2.consumerName="Aaru";
        consumer2.phone="568668";
        consumer2.sal="73565";
        consumerList.add(consumer2);
        System.out.println(consumerList); //print reference 
        for(Consumer c : consumerList) {
        	System.out.println(c.connectionNo+" "+c.consumerName+" "+c.phone+" "+c.sal);
        }
        sc.close();
	}

}
