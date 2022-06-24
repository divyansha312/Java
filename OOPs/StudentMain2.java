import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain2 {
 static ArrayList<Student2> studentList = new ArrayList<Student2>();
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StudentMain2 obj = new StudentMain2();
		while(true) {
			System.out.println("1. ADD DATA");
			System.out.println("2. DISPLAY DATA");
		    System.out.println("3. UPDATE DATA");
		    System.out.println("4. DELETE DATA");
		    System.out.println("5. QUIT");
		    System.out.println("Enter your choice::");
		    int choice = sc.nextInt();
		    if(choice==1) {
		    	obj.addData();
		    }else if(choice==2) {
		    	obj.displayData();
		    }else if(choice==3) {
		    	obj.updateData();
		    }else if(choice==4) {
		    	obj.deleteData();
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
	public void addData() {
		
		Student2 st = new Student2();
		
		System.out.println("Enter your name::");
		st.setName(sc.next());
		
		System.out.println("Enter your rollno::");
		st.setRollNo(sc.next());
		
		System.out.println("Enter your age::");
		st.setAge(sc.nextInt());
		
		System.out.println("Enter your course::");
		st.setCourse(sc.next());
		
		System.out.println("Enter your email::");
		st.setEmail(sc.next());
		
		studentList.add(st);
	}
	
	
	public void displayData() {
		if(studentList.size()==0) {
			System.out.println("List is empty");
		}
		else {
			int count=1;
			System.out.println("The Student Data is:::");
			for(Student2 var :studentList) {
				System.out.println(count+". "+var.getName()+", "+var.getRollNo()+", "+var.getAge()+", "+var.getCourse()+", "+var.getEmail());
				count++;
			}
		}
		
	}
	
	
	public void updateData() {
		System.out.println("Please Enter your rollNo::");
		String tempRollNo=sc.next();
		boolean check = false;
		for(Student2 var : studentList) {
			if(var.getRollNo().equals(tempRollNo)) {
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
		    	for(Student2 var : studentList) {
		    		if(var.getRollNo().equals(tempRollNo)) {
		    			var.setName(newName);
		    			break;
		    		}
		    	}
		    }
		    else if(choice==2) {
		    	System.out.println("To update age please enter new age::");
		    	int newAge=sc.nextInt();
		    	for(Student2 var : studentList) {
		    		if(var.getRollNo().equals(tempRollNo)) {
		    			var.setAge(newAge);
		    			break;
		    		}
		    	}
		    }
		    else if(choice==3) {
		    	System.out.println("To update course please enter new course::");
		    	String newCourse=sc.next();
		    	for(Student2 var : studentList) {
		    		if(var.getRollNo().equals(tempRollNo)) {
		    			var.setCourse(newCourse);
		    			break;
		    		     }
		    		}
		    }
		    else if(choice==4) {
		    	System.out.println("To update email please enter new email::");
		    	String newEmail=sc.next();
		    	for(Student2 var : studentList) {
		    		if(var.getRollNo().equals(tempRollNo)) {
		    			var.setName(newEmail);
		    			break;
		    		    }
		    			
		    		}
		    }
		}
		else {
	    	System.out.println("Rollno is invalid you cannot update the data");
	    	
	    }
	}
	
	
   
	public void deleteData() {
    	System.out.println("Please enter the rollno whose data you want to delete::");
    	 String tempRollNo=sc.next();
    	 boolean check=false;
    	for(Student2 var : studentList) {
    		if(var.getRollNo().equals(tempRollNo)) {
    			check=true;
    		   }
    		}
    			if(check==true) {
    				for(Student2 var2 : studentList) {
    					if(var2.getRollNo().equals(tempRollNo)) {
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

