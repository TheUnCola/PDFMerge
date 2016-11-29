import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.util.PDFMergerUtility;

public class merge {
	static PDFMergerUtility ut;
	static File[] files;
    public static void main (String [] args) throws COSVisitorException, IOException {
    	files = new File("./Files").listFiles();
    	ut = new PDFMergerUtility();
    	for (File file : files) {
    		System.out.println(file.getPath());
    		ut.addSource(file.getPath());
        }
    	
    	ut.setDestinationFileName("./Files/test.pdf");
    	ut.mergeDocuments();
    }
}


