package POI;



import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class ReadColumn {
  @Test
  public void f() throws Exception {
	
	  FileInputStream fi=new FileInputStream("G:\\TestData\\TestData.xlsx");
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fi);
	  XSSFSheet sheet1= wb.getSheetAt(0);
	  int rowcount=sheet1.getLastRowNum();
	  	System.out.println("total row is "+rowcount);
	  	for(int i=0;i<rowcount;i++)
	  	{
	  		
	  	
	  		
	  		String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
	  	
	  		System.out.println("data frome row is "+i+"is dat "+data0);
	  		
	  	}
  }
}
