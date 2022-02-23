package TestNG;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class ReadData_XLSX{
  @Test
  public void f() throws Exception {
	FileInputStream fi=new FileInputStream("G:\\TestData\\TestData.xlsx");
	XSSFWorkbook w=new XSSFWorkbook(fi);
	// xlsx//XSSFWorkbook w=new XSSFWorkbook(fi);
    Sheet s=(Sheet) w.getSheet("Sheet1");
    
	
  }
}
