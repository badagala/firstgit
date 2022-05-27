package com.mmg.pdfformat;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class InsertingImage {

	public static void main(String[] args) throws  IOException {

		// Loading an existing document
		File file = new File("F:\\pdfworld\\Sample1.pdf");
		PDDocument doc = PDDocument.load(file);

		// Retrieving the page
		PDPage page = doc.getPage(1);

		// Creating PDImageXObject object
		PDImageXObject pdImage = PDImageXObject.createFromFile("H:\\photos\\2018-01-21-14-32-17-160.jpg", doc);

		// creating the PDPageContentStream object
		PDPageContentStream contents = new PDPageContentStream(doc, page);

		// Drawing the image in the PDF document
		contents.drawImage(pdImage, 0, 0);
		

		System.out.println("Image inserted Successfully.");

		// Closing the PDPageContentStream object
		contents.close();

		// Saving the document
		doc.save("F:\\pdfworld\\Sample1.pdf");

		// Closing the document
		doc.close();
	}

}
