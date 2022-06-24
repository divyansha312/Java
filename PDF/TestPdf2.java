import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class TestPdf2 {
	public static void main(String[] args) throws IOException, DocumentException {
		
		String fileName="C:\\Users\\DIVYANSHA CHAUDHARY\\OneDrive\\New java programs\\pdffiles2.pdf";
		Document pdfDoc = new Document(); //create pdf
		FileOutputStream fileObject= new FileOutputStream(fileName);//create
		PdfWriter writer = PdfWriter.getInstance(pdfDoc, fileObject);
		pdfDoc.open();
		Paragraph para=null;
		
		para= new Paragraph("Hello this is first para !\n\n");
		pdfDoc.add(para);
		
		para= new Paragraph("Hello this is second !");
		pdfDoc.add(para);
		
		para= new Paragraph("Hello this is third para !");
		pdfDoc.add(para);
		pdfDoc.close();
		writer.close();
		
		
		
		
	}

}
