import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
 static ArrayList<Student> studentList = new ArrayList<Student>();
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("1. ADD DATA");
			System.out.println("2. DISPLAY DATA");
		    System.out.println("3. UPDATE DATA");
		    System.out.println("4. DELETE DATA");
		    System.out.println("5. QUIT");
		    System.out.println("Enter your choice::");
		    int choice = sc.nextInt();
		    if(choice==1) {
		    	addData();
		    }else if(choice==2) {
		    	displayData();
		    }else if(choice==3) {
		    	updateData();
		    }else if(choice==4) {
		    	deleteData();
		    }else if(choice==5) {
		    	System.out.println("Do you want to quit?\nEnter yes or no:");
		    	String choice2 = sc.next();	
		    	if(choice2.equals("yes")) {
		    		System.out.println("Program ended successfully \n*********************************");
		    		break;
		    	}else {
		    		System.out.println("Please continue...");
		    	}
		    }else {
		    	System.out.println("Invalid choice....Please try again!! \n");
		    }
		}

	}
	public static void addData() {
		
		Student st = new Student();
		
		System.out.println("Enter your name::");
		st.name=sc.next();
		
		System.out.println("Enter your rollno::");
		st.rollNo=sc.next();
		
		System.out.println("Enter your age::");
		st.age=sc.nextInt();
		
		System.out.println("Enter your course::");
		st.course=sc.next();
		
		System.out.println("Enter your email::");
		st.email=sc.next();
		
		studentList.add(st);
	}
	
	
	public static void displayData() {
		if(studentList.size()==0) {
			System.out.println("List is empty");
		}
		else {
			int count=1;
			System.out.println("The Student Data is:::");
			for(Student var :studentList) {
				System.out.println(count+". "+var.name+", "+var.rollNo+", "+var.age+", "+var.course+", "+var.email);
				count++;
			}
		}
		
	}
	
	
	public static void updateData() {
		System.out.println("Please Enter your rollNo::");
		String tempRollNo=sc.next();
		boolean check = false;
		for(Student var : studentList) {
			if(var.rollNo.equals(tempRollNo)) {
				check=true;
				break;
			}
		}
		if(check==true) {
			System.out.println("What do you want to update::?");
			System.out.println("1. Name");
			System.out.println("2. Age");
			System.out.println("3 Course");
			System.out.println("4. Email");
		    System.out.println("Enter your choice::");
		    int choice=sc.nextInt();
		    if(choice==1) {
		    	System.out.println("To update name please enter new name::");
		    	String newName=sc.next();
		    	for(Student var : studentList) {
		    		if(var.rollNo.equals(tempRollNo)) {
		    			var.name=newName;
		    			break;
		    		}
		    	}
		    }
		    else if(choice==2) {
		    	System.out.println("To update age please enter new age::");
		    	int newAge=sc.nextInt();
		    	for(Student var : studentList) {
		    		if(var.rollNo.equals(tempRollNo)) {
		    			var.age=newAge;
		    			break;
		    		}
		    	}
		    }
		    else if(choice==3) {
		    	System.out.println("To update course please enter new course::");
		    	String newCourse=sc.next();
		    	for(Student var : studentList) {
		    		if(var.rollNo.equals(tempRollNo)) {
		    			var.course=newCourse;
		    			break;
		    		     }
		    		}
		    }
		    else if(choice==4) {
		    	System.out.println("To update email please enter new email::");
		    	String newEmail=sc.next();
		    	for(Student var : studentList) {
		    		if(var.rollNo.equals(tempRollNo)) {
		    			var.name=newEmail;
		    			break;
		    		    }
		    			
		    		}
		    }
		}
		else {
	    	System.out.println("Rollno is invalid you cannot update the data");
	    	
	    }
	}
	
	
   
	public static void deleteData() {
    	System.out.println("Please enter the rollno whose data you want to delete::");
    	 String tempRollNo=sc.next();
    	 boolean check=false;
    	for(Student var : studentList) {
    		if(var.rollNo.equals(tempRollNo)) {
    			check=true;
    		   }
    		}
    			if(check==true) {
    				for(Student var2 : studentList) {
    					if(var2.rollNo.equals(tempRollNo)) {
    						studentList.remove(var2);
    						break;
    					}
    					
    				}
    			}
    				
    		else {
    			System.out.println("Rollno is invalid yow can not delete data");
    		}
    	
    	 
    	
    }
	
}
