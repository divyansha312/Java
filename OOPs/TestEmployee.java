import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class TestEmployee {

	public static void main(String[] args) throws ParseException {
	  Scanner sc = new Scanner(System.in);
	  
	  Employee[] arr = new Employee[3];
	  System.out.println("Enter the data elements of employee::");
	  for(int i=0;i<arr.length;i++) {
		  arr[i] = new Employee();
		  System.out.println("Enter the registration number");
		  arr[i].employeeRegNo= sc.next();
		  System.out.println("Enter the emeployee name");
		  arr[i].employeeName=sc.next();
		  System.out.println("Enter the employee salary");
		  arr[i].employeeSalary=sc.next();
		  System.out.println("Enter the joining date of employee");
		  String tempDate=sc.next(); //12/05/2022
		  arr[i].employeeJoiningDate = new SimpleDateFormat("dd/mm/yyyy").parse(tempDate);
		  
	  }
	  System.out.println("The employee data will be::");
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i].employeeRegNo+" "+arr[i].employeeName+" "+arr[i].employeeSalary+" "+arr[i].employeeJoiningDate);
	  }
	  

	}

}
