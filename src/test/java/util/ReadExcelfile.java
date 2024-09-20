package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//to invoke this method create a object
		ReadExcelfile rd= new ReadExcelfile();
		rd.getData("login");
	}
	
	public String[][] getData(String excelSheetname) throws EncryptedDocumentException, IOException {
		
		
		File f= new File(System.getProperty("C:\\Users\\kruth\\Documents\\SK\\SeleniumFramework\\src\\test\\resources\\TestData\\testdata.xlsx"));
		FileInputStream fis= new FileInputStream(f);
		//to read the workbook
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
//		String cellValue= sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(cellValue);
		
		//get dynamic #of rows and columns
		int rowCount= sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowCount;i++) {
			XSSFRow row=sheet.getRow(i);
			
			int cellCount=row.getPhysicalNumberOfCells();
			for(int j=0;j< cellCount; j++) {
				XSSFCell cell=row.getCell(j);
				
			}
		}
		
		//close workbook and input stream
		wb.close();
		fis.close();
		return null;
		
		
		
		
		
		
		
		
		
		
//		XXSFWorkbook wb= WorkbookFactory.create(fis);
//		//to reach sheet 1/2/3...
//		Sheet s= wb.getSheet(excelSheetname);
//		
//		//to get total# of rows
//		int totrows = s.getLastRowNum();
//		System.out.println(totrows);
//		
//		//to get total# of cols
//		Row rowcells = s.getRow(0);
//		int totcols = rowcells.getLastCellNum();
//		System.out.println(totcols);
//		
//		
//		//format the data from excel and store it as String/obj to send as a parameter
//		DataFormatter format= new DataFormatter();
//		
//		String testdata[][] = new String[totrows][totcols];
//		for(int i=1;i<=totrows;i++) {
//			for(int j=0;j<totcols;j++) {
//				testdata[i-1][j]=format.formatCellValue(s.getRow(i).getCell(j));
//				System.out.println(testdata[i-1][j]);
//			}
//		}
//		return testdata;
//
//	
	}
}
