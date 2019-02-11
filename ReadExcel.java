package week7.day13and14;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/login.xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		XSSFCell cell = wsheet.getRow(2).getCell(1);
		//String rawValue = cell.getRawValue();
		//System.out.println(rawValue);
		System.out.println(cell.getStringCellValue());
        wbook.close();
	}

}
