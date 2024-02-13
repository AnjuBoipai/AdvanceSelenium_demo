package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility {
 public static String fetchdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	 FileInputStream fis=new FileInputStream(Iconstant.Excel_filePath);
	 Workbook w=WorkbookFactory.create(fis);
	Sheet s = w.getSheet(sheet);
	Row r = s.getRow(row);
	return r.getCell(cell).toString();
 }
 
 public static int rowSize(String sheet) throws EncryptedDocumentException, IOException {
	 FileInputStream fis =new FileInputStream(Iconstant.Excel_filePath);
	 Workbook w=WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getPhysicalNumberOfRows();
 }
 
 
 public static  int columnSize(String sheet) throws EncryptedDocumentException, IOException {
	 FileInputStream fis = new FileInputStream(Iconstant.Excel_filePath);
	 Workbook w=WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getRow(0).getPhysicalNumberOfCells();
 }
 
 public static Object[][]fetchAllData(String sheet) throws EncryptedDocumentException, IOException{
	 FileInputStream fis=new FileInputStream(Iconstant.Excel_filePath);
	 Workbook w=WorkbookFactory.create(fis);
	Sheet s = w.getSheet(sheet);
	 int rowSize=s.getPhysicalNumberOfRows();
	 int columnSize= s.getRow(0).getPhysicalNumberOfCells();
	 Object d[][]= new Object [rowSize][columnSize] ;
	 for(int i =0;i<rowSize;i++) {
		 for(int j=0;j<columnSize;j++) {
			 d[i][j]=s.getRow(i).getCell(j).toString();
		 }
	 }
	return d;
	 
 }
}
