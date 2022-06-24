import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainWorkingClass {
	//We can not access non-static variable or method within the static method in same class
	static ArrayList<Consumer> consumerList= new ArrayList<Consumer>();
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		MainWorkingClass mainObject= new MainWorkingClass();
		String fileName="D:\\consumer_data.txt";
		File fileObject= new File(fileName);
		boolean fileStatus=fileObject.createNewFile();
		while(true) {
			System.out.println("1. ADD DATA ");
			System.out.println("2. DISPLAY DATA");
			System.out.println("3. UPDATE DATA ");
			System.out.println("4. DELETE DATA ");
			System.out.println("5. QUIT ");
			System.out.print("Enter your choice (in 1-5 numbers ) : ");
			int choice = sc.nextInt();
			if(choice==1) {
				mainObject.addConsumerData(fileName);
			}else if(choice==2) {
				mainObject.displayConsumerData();
			}else if(choice==3) {
				mainObject.updateConsumerData();
			}else if(choice==4) {
				mainObject.deleteConsumerData();
			}else if (choice==5) {
				System.out.print("Do you want to quit the program ? \nEnter yes or no :");
				String choice2=sc.next();
				if(choice2.equals("yes")) {
					System.out.println("Program ended successfully !!\n");
					break;
				}else {
					System.out.println("Please continue......\n");
				}
				
			}else {
				System.out.println("Invalid Option... Please try again !!\n\n");
			}
			
			
		}
		
	}
	
	public void addConsumerData(String fileName) throws IOException {
		
		FileWriter writer= new FileWriter(fileName);
		Consumer consumer= new Consumer();
		
		System.out.println("Enter consumer name :: ");
		consumer.setConsumerName(sc.next());
		System.out.println("Enter account number :: ");
		consumer.setAccountNumber(sc.next());
		System.out.println("Enter connection number :: ");
		consumer.setConnectionNumber(sc.next());
		System.out.println("Enter consumer mobile number :: ");
		consumer.setConsumerMobile(sc.next());
		System.out.println("Enter consumer email :: ");
		consumer.setConsumerEmail(sc.next());
		writer.write(consumer.makeOneLine());
		writer.close();
		//consumerList.add(consumer);
	}
	public void displayConsumerData() {
		if(consumerList.size()==0) {
			System.out.println("No consumer found !!");
		}else {
			System.out.println("=====================================");
			System.out.println("...TOTAL CONSUMER DATA................");
			System.out.println("=======================================");
			
			for(Consumer cons : consumerList) {
				System.out.println(cons.getConsumerName()+", "+cons.getAccountNumber()+", "+cons.getConnectionNumber()+", "+cons.getConsumerMobile()+", "+cons.getConsumerEmail());
			}
			
		}
		
	}
	public void updateConsumerData() {
		System.out.println("Enter connection number :: ");
		String tempConnectionNumber=sc.next();
		
		boolean exist=false;
		Consumer foundConsumer=null;
		for(Consumer consumer: consumerList) {
			if(consumer.getConnectionNumber().equals(tempConnectionNumber)) {
				foundConsumer=consumer;
				exist=true;
				break;
			}
		}
		
		if(exist) {
			System.out.println("What do you want to update ? ");
			System.out.println("1. Consumer Name ");
			System.out.println("2. Consumer Mobile No");
			System.out.println("3. Consumer Email Id ");
			int option=sc.nextInt();
			
			if(option==1) {
				System.out.println("Enter new consumer name :: ");
				String newName=sc.next();
				foundConsumer.setConsumerName(newName);
			}else if(option==2) {
				
			}else if(option==3) {
				
			}else {
				System.out.println("Invalid choice !");
			}
			
			
			
		}else {
			System.out.println("No Consumer found !");
		}
		
		
		
		
	}
	public void deleteConsumerData() {
		System.out.println("Enter connection number :: ");
		String tempConnectionNumber=sc.next();
		
		boolean exist=false;
		Consumer foundConsumer=null;
		for(Consumer consumer: consumerList) {
			if(consumer.getConnectionNumber().equals(tempConnectionNumber)) {
				foundConsumer=consumer;
				exist=true;
				break;
			}
		}
		if(exist) {
			consumerList.remove(foundConsumer);
		}else {
			System.out.println("No Consumer found !");
		}
		
		
	}
	
	
}
