package POI;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
  @Test
  public void f() throws Exception {
	  FileInputStream fi=new FileInputStream("C:\\Users\\HP\\Desktop\\SOFTWARE TESTING PROGRAMS\\TestData\\LoginData.xlsx");
	  XSSFWorkbook w=new XSSFWorkbook(fi);
	  XSSFSheet sheet1=w.getSheetAt(0);
	String data0=  sheet1.getRow(0).getCell(0).getStringCellValue();
	String data2= sheet1.getRow(1).getCell(0).getStringCellValue();
	System.out.println("data from excel is "+data0);
	String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("data from excel is "+data2);
System.out.println("data frome xcel is "      +data1);
System.out.println("total rows" +sheet1.getLastRowNum());
Row r=sheet1.getRow(0);
System.out.println("total cell"   +r.getLastCellNum());


		w.close();
	}
	
	  }

