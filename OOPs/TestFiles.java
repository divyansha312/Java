import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFiles {

	public static void main(String[] args) throws IOException {
		String fileName ="C:\\Users\\DIVYANSHA CHAUDHARY\\OneDrive\\New java programs\\testing.txt";
				 //.txt,.docs,.doc,.dat etc
		File fileObj = new File(fileName);
		boolean fileStatus = fileObj.createNewFile();//to create new file
				if(fileStatus) {
					System.out.println("File Created!!");
				}else {
					System.out.println("File already exist!!");
				}
				FileWriter fWriter= new FileWriter(fileName);
				fWriter.write("Hello this is testing data");
				fWriter.close();
		

	}

}
