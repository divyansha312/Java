import java.util.Scanner;

public class Test2Consumer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Consumer[] arr = new Consumer[2];
		System.out.println("Enter the data elements of consumer::");
		for(int i=0;i<arr.length;i++) {
			arr[i]= new Consumer();
			System.out.println("Enter connection number::");
			arr[i].connectionNo=sc.next();
			System.out.println("Enter consumer name::");
			arr[i].consumerName=sc.next();
			System.out.println("Enter phone number::");
			arr[i].phone=sc.next();
			System.out.println("Enter salary::");
			arr[i].sal=sc.next();
		}
		System.out.println("The consumer data will be::");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].connectionNo +" "+ arr[i].consumerName +" "+ arr[i].phone +" "+ arr[i].sal);
		}

	}

}
