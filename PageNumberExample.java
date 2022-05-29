package com.mmg.pdfformat;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PageNumberExample {

	final boolean isCompress = false;
	final boolean isContextReset = true;

	public static void main(String[] args) throws IOException {
		new PageNumberExample().addPageNumber("F:\\pdfworld\\Samplesmerged.pdf");
	}

	public void addPageNumber(String pdfPath) throws IOException {
		File mergePpdfFile = new File(pdfPath);
		PDDocument document = PDDocument.load(mergePpdfFile);
		int totalPage = document.getNumberOfPages();
		for (int i = 0; i < totalPage; i++) {
			PDPage page = document.getPage(i);

			PDPageContentStream stream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND,
					isCompress, isContextReset);

			stream.setNonStrokingColor(Color.BLACK);
			stream.beginText();
			stream.setFont(PDType1Font.COURIER, 10);
			stream.endMarkedContent();
			stream.newLineAtOffset(100, -100); // Set position where you want to print page number.
			//stream.newLineAtOffset(100, 100); 
			//stream.moveTextPositionByAmount(250, 750);

			stream.showText("Page " + (i + 1) + " of " + totalPage); //
			stream.endMarkedContent();
			stream.endText();
			stream.close();

		}
		System.out.println("Page number added successfully");
		document.save(pdfPath);
		document.close();
	}

}
