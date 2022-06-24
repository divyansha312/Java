import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class TestPdf {
	public static void main(String[] args) throws IOException {
		String fileName="C:\\Users\\DIVYANSHA CHAUDHARY\\OneDrive\\New java programs\\PDF_FILES.pdf";
		PDDocument pdfDoc = new PDDocument(); //create pdf
		pdfDoc.addPage(new PDPage()); // attaching a page
		pdfDoc.addPage(new PDPage());
		pdfDoc.addPage(new PDPage());
		pdfDoc.save(fileName);	
		
	}

}

