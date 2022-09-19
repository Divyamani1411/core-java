package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] getData(String excelFileName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./testdata/"+excelFileName+".xlsx");
		// particular sheet
		XSSFSheet sheet = book.getSheetAt(0);
		// rows
		int rowNumber = sheet.getLastRowNum();
		System.out.println(rowNumber);
		// cols
		XSSFRow row = sheet.getRow(0);
		short cellNumber = row.getLastCellNum();
		System.out.println(cellNumber);
		String[][] data=new String[rowNumber][cellNumber];
		// iterate
		for (int i = 1; i <= rowNumber; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for (int j = 0; j < cellNumber; j++) {
				XSSFCell eachCell = eachRow.getCell(j);
				String cellValue = eachCell.getStringCellValue();
				data[i-1][j]=cellValue;
				System.out.println(cellValue);
			}
		}
		book.close();
		return data;
	}

	 

}
