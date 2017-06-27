package getDataFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		FileInputStream N = new FileInputStream("C:\\Users\\Fluffyy\\Desktop\\Exceltest.xlsx");
		
		//First to get data from excel We have traverse from workbook --> Sheet --> Row --> column --> then grab the value required/set the value needed.
		
		XSSFWorkbook W = new XSSFWorkbook(N); //workbook class and pass the argument of the excel object that is declared.
		XSSFSheet sheet=W.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(2);
		XSSFCell cell=row.getCell(1);
		System.out.println(cell.getBooleanCellValue());
		

	}

}
