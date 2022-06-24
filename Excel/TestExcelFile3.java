import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestExcelFile3 {
	public static void main(String[] args) throws IOException {
		
		//declare filename with path
		String fileName="C:\\Users\\DIVYANSHA CHAUDHARY\\OneDrive\\New java programs\\testExcel3.xls";
		
		Scanner sc= new Scanner(System.in);
		
		HSSFWorkbook workBook= new HSSFWorkbook();
		
		HSSFSheet workSheet = workBook.createSheet("FirstSheet"); 
		
		HSSFRow rowHeader = workSheet.createRow(0);
		
		rowHeader.createCell(0).setCellValue("Roll No");

		rowHeader.createCell(1).setCellValue("Student Name");

		rowHeader.createCell(2).setCellValue("Mobile Number");

		rowHeader.createCell(3).setCellValue("Course");
		
		
		
		for(int i=1;i<=3;i++) {
			
			HSSFRow row = workSheet.createRow(i);
			System.out.println("Enter Student roll number :: ");
			row.createCell(0).setCellValue(sc.next());
			System.out.println("Enter student name :: ");
			row.createCell(1).setCellValue(sc.next());
			System.out.println("Enter mobile number :: ");
			row.createCell(2).setCellValue(sc.next());
			System.out.println("Enter course :: ");
			row.createCell(3).setCellValue(sc.next());
		}
		
		
		FileOutputStream fileObject = new FileOutputStream(fileName);
		
		workBook.write(fileObject);
		
		fileObject.close();
		
		workBook.close();
		System.out.println("File Created successfully...");
	}

}
