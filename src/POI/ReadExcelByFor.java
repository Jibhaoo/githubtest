package POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class ReadExcelByFor {
  @Test
  public void f() throws Exception {
	
	  FileInputStream fi=new FileInputStream("G:\\TestData\\TestData.xlsx");
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fi);
	  Sheet s=wb.getSheet("Sheet1");
	
	Row r;
	Cell c;
	for(int i=0;i<s.getLastRowNum();i++)
	{
		r=s.getRow(i);
		System.out.println("total rows"+i );
		   for(int j=0;j<r.getLastCellNum();j++)
		   {
			   c=r.getCell(j);
			   
			   System.out.println(c.toString());
			   
			   wb.close();
		   }
		
	}
	 
  }
}
