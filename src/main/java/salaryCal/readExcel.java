package salaryCal;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

public class readExcel {

    public static void main(String[] args) throws InvalidFormatException {
        //Creating a Workbook from an Excel file (.xls or .xlsx)
        String SAMPLE_XLSX_FILE_PATH = "src/main/resources/201806.xlsx";
        Workbook workbook;

        try {
            workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
            System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");    

            // 2. Or you can use a for-each loop
            System.out.println("Retrieving Sheets using for-each loop");
            for(Sheet sheet: workbook) {
                System.out.println("=> " + sheet.getSheetName());
            }
            
            workbook.close();
            
        } catch (EncryptedDocumentException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }   
	}
}
