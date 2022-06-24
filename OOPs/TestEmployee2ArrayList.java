import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee2ArrayList {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> empList = new ArrayList<>();
		while(true) {
			System.out.println("1. ADD DATA\n 2.DISPLAY DATA\n 3.Enter your choice \n 4. Exit");
			int option = sc.nextInt();
			if(option==1) {
				Employee emp= new Employee();
				System.out.println("Enter Employee name::");
				emp.employeeName= sc.next();
				System.out.println("Enter Registration number::");
				emp.employeeRegNo=sc.next();
				System.out.println("Enter Employee salary::");
				emp.employeeSalary=sc.next();
				System.out.println("Enter Date of joining::");
				String temp = sc.next();
				emp.employeeJoiningDate=new SimpleDateFormat("dd/mm/yyyy").parse(temp);
				empList.add(emp);
				
			}
			else if(option==2) {
				for(Employee em : empList) {
					System.out.println(em.employeeName+" "+em.employeeRegNo+" "+em.employeeSalary+" "+em.employeeJoiningDate);
				}
			}
			else if(option==4) {
				System.out.println("END...");
				break;
			}
			else {
				System.out.println("Invalid option....");
			}
		}

	}

}
