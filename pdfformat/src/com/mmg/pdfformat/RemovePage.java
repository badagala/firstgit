package com.mmg.pdfformat;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class RemovePage {

	public static void main(String[] args) throws IOException {

		File file = new File("F:\\pdfworld\\Sample1.pdf");
		PDDocument doc = PDDocument.load(file);

		// Listing the number of existing pages
		int noOfPages = doc.getNumberOfPages();

		System.out.print(noOfPages);

		// Removing the pages
		doc.removePage(1);
		doc.removePage(2);
		

		System.out.println("Page removed successfully.");

		// Saving the document
		doc.save(new File("F:\\pdfworld\\Sample1.pdf"));

		// Closing the document
		doc.close();

	}

}
