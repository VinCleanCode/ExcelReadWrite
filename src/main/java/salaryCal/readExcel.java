package salaryCal;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

public class readExcel {

	public static void main(String[] args) {
        //Creating a Workbook from an Excel file (.xls or .xlsx)
	    String filePath = "src/main/resources/001_2018_6.xls";
	    Workbook workbook;
        
	    try {
            workbook = WorkbookFactory.create(new File(filePath));
            System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");    
            
        } catch (EncryptedDocumentException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }   
	}
}
