package com.mmg.pdfreader;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FileReader {

	public static void main(String[] args) {

		try {

			PDDocument docs = PDDocument.load(new File("G:\\ravi.pdf"));
			
			PDFTextStripper pdf=new PDFTextStripper();
			String pdfgetdoc=pdf.getText(docs);
			System.out.println(pdfgetdoc);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
