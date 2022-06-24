import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.layout.element.Cell;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class TestPdf4 {
	public static void main(String[] args) throws DocumentException, IOException {
		String fileName="C:\\Users\\DIVYANSHA CHAUDHARY\\OneDrive\\New java programs\\pdffiles4.pdf";
		FileOutputStream fOut= new FileOutputStream(fileName);
		String userPwd="123";
		String ownerPwd="abc";
		
		Document doc= new Document(); 
		
		PdfWriter writer = PdfWriter.getInstance(doc, fOut);
		writer.setEncryption(userPwd.getBytes(),ownerPwd.getBytes(),PdfWriter.ALLOW_PRINTING,PdfWriter.ENCRYPTION_AES_128);
		doc.open();
		
		Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN,20,Font.BOLD);
		Font iFont = new Font(Font.FontFamily.TIMES_ROMAN,20,Font.BOLDITALIC);
		
		Paragraph para = null;
		
		para = new Paragraph("Hello this heading",boldFont);
		doc.add(para);
		para = new Paragraph("Hello this second line",iFont);
		doc.add(para);
		para= new Paragraph("The Bouncy Castle Crypto package is a Java implementation of cryptographic algorithms. This jar contains JCE provider and lightweight API for the Bouncy Castle Cryptography APIs for JDK 1.5 to JDK 1.8.\r\n"
				+ "\r\n"
				+ "You can download jar file bcprov-jdk15on 1.52 in this page");
		doc.add(para);
		
		
		//Table table = new Table(2);
		
		
		PdfPTable table= new PdfPTable(2);
		Cell cell= new Cell();
		
		doc.close();
		
		doc.close();
		fOut.close();
		writer.close();
		
	}

}
