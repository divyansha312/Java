import java.util.Scanner;

public class pattern4 {
	

	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();

	      for(int i=0;i<n;i++){
	          for(int j=0;j<i;j++){
	              System.out.print(" ");
	              
	          }
	          for(int k=n-1-i;k>=0;k--){
	              System.out.print("*");
	          }
	          System.out.println();
	          
	      }
	      
	    }   

}