import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestExcelFile2 {
	public static void main(String[] args) throws IOException {
		
		//declare filename with path
		String fileName="C:\\Users\\DIVYANSHA CHAUDHARY\\OneDrive\\New java programs\\testExcel2.xls";
		
		HSSFWorkbook workBook= new HSSFWorkbook();
		
		HSSFSheet workSheet = workBook.createSheet("FirstSheet"); 
		
		HSSFRow rowHeader = workSheet.createRow(0);
		
		rowHeader.createCell(0).setCellValue("Roll No");

		rowHeader.createCell(1).setCellValue("Student Name");

		rowHeader.createCell(2).setCellValue("Mobile Number");

		rowHeader.createCell(3).setCellValue("Course");
		
		
		
		for(int i=1;i<=6;i++) {
			
			HSSFRow row = workSheet.createRow(i);
			
			row.createCell(0).setCellValue("1");

			row.createCell(1).setCellValue("Neha");

			row.createCell(2).setCellValue("12345678");

			row.createCell(3).setCellValue("B.tech");
		}
		
		
		FileOutputStream fileObject = new FileOutputStream(fileName);
		
		workBook.write(fileObject);
		
		fileObject.close();
		
		workBook.close();
		
	}

}
