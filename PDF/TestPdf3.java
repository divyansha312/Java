import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class TestPdf3 {
	public static void main(String[] args) throws IOException, DocumentException {
		
		String fileName="C:\\Users\\DIVYANSHA CHAUDHARY\\OneDrive\\New java programs\\PdfFiles3.pdf";
		Document pdfDoc = new Document(); //create pdf
		FileOutputStream fileObject= new FileOutputStream(fileName);//create
		PdfWriter writer = PdfWriter.getInstance(pdfDoc, fileObject);
		pdfDoc.open();
		pdfDoc.addCreationDate();
		pdfDoc.addTitle("Testing");
		pdfDoc.addSubject("Hello Test");
		Paragraph para=null;
		
		Font boldFont= new Font(Font.FontFamily.TIMES_ROMAN,20,Font.BOLD);
		
		para= new Paragraph("Hello this first para !\n\n",boldFont);
		pdfDoc.add(para);
		
		para= new Paragraph("Hello this second !");
		pdfDoc.add(para);
		
		para= new Paragraph("Hello this third para !");
		pdfDoc.add(para);
		pdfDoc.close();
		writer.close();
		
	}

}
