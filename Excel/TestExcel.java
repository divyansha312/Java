import java.io.FileOutputStream;
import java.io.IOException;
public class TestExcel {
	public static void main(String[] args) throws IOException {
		HSSFWorkbook workBook = new HSSFWorkbook();
		String fileName="D:\\XYZ\\textExcel1.xls"; //.xls, .xlsx
		FileOutputStream fileObject = new FileOutputStream(fileName);
		workBook.write(fileObject);
		
	}
}	
