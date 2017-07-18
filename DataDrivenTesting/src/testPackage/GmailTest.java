package testPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailTest {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	@Test(dataProvider="getData")
	public static void main(String args[])
	{
		getData(1,0);
	}
	
	
	
	
	
	@DataProvider
	public Objects[][] getData() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Fluffyy\\Desktop\\TestData.xlsx");
		 wb=new XSSFWorkbook(fis);
		 sheet = wb.getSheet("Sheet1");
		 System.out.println("First row number:" + sheet.getFirstRowNum() + "Last row Number :" + sheet.getLastRowNum());
		 
		 row = sheet.getRow(1);
		 cell = row.getCell(0);
		 cell.getStringCellValue();
		
		return null;
	}
	

	
}
