package getDataFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenericExcelDataDriven {
	static FileInputStream F;
	static XSSFWorkbook WB;
	static XSSFSheet S1;
	static XSSFRow row;
	static XSSFCell cell;
	
	
	public static void main(String args[]) throws IOException
	{
		F = new FileInputStream("C:\\Users\\Fluffyy\\Desktop\\Exceltest.xlsx");
		String value=getCellData(1,1);// row value and column value starts with [0,0]
		System.out.println(value);
		String value1=getCellData(3,1);
		System.out.println(value1);
		String set=setCellData("Hello",1,1);
		System.out.println(set);
		
	}
	
	public static String getCellData(int rownum, int col) throws IOException
	{
		
		WB = new XSSFWorkbook(F);
		S1 =WB.getSheet("Sheet1");
		row = S1.getRow(rownum);
		cell = row.getCell(col);
		return cell.getStringCellValue();
		
	}
	
	public static String setCellData(String text,int rownum, int col) throws IOException
	
	{
		
		WB = new XSSFWorkbook(F);
		S1 =WB.getSheet("Sheet1");
		row = S1.getRow(rownum);
		cell = row.getCell(col);
		cell.setCellValue(text);
		return cell.getStringCellValue();
		
	}



}
