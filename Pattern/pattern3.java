import java.util.Scanner;

public class pattern3 {
	

	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	         int n= scn.nextInt();
	        for(int i=0;i<n;i++){
	            for(int j=n-1-i;j>=0;j--){
	                System.out.print("&");
	            }
	            for(int k=0;k<=i;k++){
	               System.out.print("*");
	            }
	            System.out.println();
	        }

	    }
}
