package cpom.mmg.pdfeditor;

import java.awt.*;
import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;


public class Editing {

	public static void main(String[] args) {
		
	
		
		        //load a PDF document
	
		        PdfDocument doc = new PdfDocument();
		
		        doc.loadFromFile("C:\\Users\\Administrator\\Desktop\\input.pdf");
		
		        //create a true type font
		
		        PdfTrueTypeFont font = new PdfTrueTypeFont(new Font("Times New Roman", Font.PLAIN, 10));
		
		 
		
		        //get the page size
		
		        Dimension2D pageSize = doc.getPages().get(0).getSize();
		
		 
		
		        //declare a float variable
		
		        float y = (float) pageSize.getHeight() - 72;
		
		 
		
		        //loop through the pages
		
		        for (int i = 0; i < doc.getPages().getCount(); i++) {
		
		 
		
		            //initialize PdfPageNumberField instance
		
		            PdfPageNumberField number = new PdfPageNumberField();
		
		 
		
		            //initialize PdfPageCountField instance
		
		            PdfPageCountField count = new PdfPageCountField();
		
		 
		
		            //create PdfCompositeField instance
		
		            PdfCompositeField compositeField = new PdfCompositeField(font, PdfBrushes.getBlack(), "Page {0} of {1}", number, count);
		
		 
		
		            //set the text alignment within the composite field
		
		            compositeField.setStringFormat(new PdfStringFormat(PdfTextAlignment.Right, PdfVerticalAlignment.Top));
	
		
		
		            //get the text size
		
		            Dimension2D textSize = font.measureString(compositeField.getText());
		
		 
		
		            //set the position and size of composite field
		
		            compositeField.setBounds(new Rectangle2D.Float((float) pageSize.getWidth() - (float) textSize.getWidth() - 80, y, (float) textSize.getWidth(), (float) textSize.getHeight()));
		
		 
		
		            //draw composite filed on PDF page
		
		            compositeField.draw(doc.getPages().get(i).getCanvas());
		
		        }
		
		 
		
		        //save to another file
		
		        doc.saveToFile("output/AddPageNumbers.pdf");
		
		    }
		

}


