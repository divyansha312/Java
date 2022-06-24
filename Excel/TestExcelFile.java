import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestExcelFile {
	public static void main(String[] args) throws IOException {
		HSSFWorkbook workBook = new HSSFWorkbook();
		String fileName="C:\\Users\\DIVYANSHA CHAUDHARY\\OneDrive\\New java programs\\testExcel1.xls"; //.xls, .xlsx
		FileOutputStream fileObject = new FileOutputStream(fileName);
		workBook.write(fileObject);
		
	}

}
