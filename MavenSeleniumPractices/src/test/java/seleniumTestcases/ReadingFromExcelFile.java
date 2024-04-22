package seleniumTestcases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcelFile {

	//public static File file = null;
	public static FileInputStream fis = null;
	public static Workbook workbook;
	public static Sheet sheet;

	public static void main(String[] args) {

		try {

			if (fis == null) {
				//file = new File(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\Demo.xlsx");
				fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\Demo.xlsx");
				workbook = WorkbookFactory.create(fis);

				// Getting the Sheet of the excel file
				sheet = workbook.getSheetAt(0);

				/*
				 * //Getting the row Row row = sheet.getRow(0);
				 * 
				 * //Getting the column Cell cell = row.getCell(0);
				 * 
				 * System.out.println(cell);
				 */

				// Iterating each row and cell of the sheet
				
				for (Row row : sheet) {
					for (Cell cell : row) {
						if (cell.getCellType() == CellType.STRING) {
							System.out.println(cell.getStringCellValue() + "\t");
						} else if (cell.getCellType() == CellType.NUMERIC) {
							System.out.print(cell.getNumericCellValue() + "\t");
						} else if (cell.getCellType() == CellType.BLANK) {
							System.out.print("Blank cell" + "\t");
						}
						
					}
				}

			}
			workbook.close();
		} catch (Throwable t) {
			t.printStackTrace();
		}

	}

}
