package com.mmg.pdfformat;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;


public class MergingPdf {
	
	public static void main(String[] args) throws  IOException {
		//Loading an existing PDF document  
        File file1 = new File("F:\\pdfworld\\Sample1.pdf");  
        PDDocument document1 = PDDocument.load(file1);   
        File file2 = new File("F:\\pdfworld\\Sample.pdf");  
        PDDocument document2 = PDDocument.load(file2);    
		/*
		 * File file3 = new File("/eclipse-workspace/blank3.pdf"); PDDocument document3
		 * = PDDocument.load(file3);
		 */
  //Create PDFMergerUtility class object  
        PDFMergerUtility PDFmerger = new PDFMergerUtility();  

  //Setting the destination file path  
  PDFmerger.setDestinationFileName("F:\\pdfworld\\Samplesmerged.pdf");  

  //adding the source files  
  PDFmerger.addSource(file1);  
  PDFmerger.addSource(file2);  
 // PDFmerger.addSource(file3);  

  //Merging the documents  
  PDFmerger.mergeDocuments(null);  

   System.out.println("PDF Documents merged to a single file successfully");  
    
//Close documents  
  document1.close();  
  document2.close();  
 // document3.close();  
	}

}
