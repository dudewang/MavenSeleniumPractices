package seleniumTestcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	static XSSFWorkbook workbook;
	
	public static void main(String[] args) {
		try
		{
		//File sourceFile = new File(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\userPassData.xlsx");
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\userPassData.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(sheet1.getRow(1).getCell(0));
		System.out.println(data0);
		
		System.out.println(sheet1.getLastRowNum());
		System.out.println(sheet1.getRow(0).getLastCellNum());
		
		for(int i=1; i<=sheet1.getLastRowNum(); i++)
		{
			Row r = sheet1.getRow(i);
			for(int j=0;j<r.getLastCellNum(); j++)
			{
				System.out.println(sheet1.getRow(i).getCell(j));
			}
				
			
		}
		
		
		/*for(Row row : sheet1)
		{
			for(Cell cell : row)
			{
				if (cell.getCellType() == CellType.STRING) {
					System.out.print(cell.getStringCellValue() + " " + cell.getStringCellValue());
					System.out.println();
				} else if (cell.getCellType() == CellType.NUMERIC) {
					System.out.print(cell.getNumericCellValue() + "\t");
				} else if (cell.getCellType() == CellType.BLANK) {
					System.out.print("Blank cell" + "\t");
				}
			}
		}*/
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
