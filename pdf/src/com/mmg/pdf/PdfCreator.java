package com.mmg.pdf;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class PdfCreator {

	public static void main(String[] args) throws IOException {

		PDDocument pdfdoc = new PDDocument();
		for (int i = 0; i < 5; i++) {
			// Creating a blank page

			// Adding the blank page to the document
			pdfdoc.addPage(new PDPage());
		}
		// pdfdoc.addPage(new PDPage());

		// path where the PDF file will be store
		pdfdoc.save("F:\\pdfworld\\Sample1.pdf");
		// prints the message if the PDF is created successfully
		System.out.println("PDF created");
		// closes the document
		pdfdoc.close();
	}

}