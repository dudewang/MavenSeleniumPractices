package rough;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		
		try
		(
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\testData.xlsx");
		)
		{
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("loginData");
			
			
			System.out.println(sheet.getLastRowNum());
			for(int i=0 ; i<=sheet.getLastRowNum(); i++)
			{
				XSSFRow row = sheet.getRow(i);
				for(int j=0; j<row.getLastCellNum(); j++)
				{
					System.out.print(sheet.getRow(i).getCell(j));
				}
				System.out.println();
			}
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
			
		
		
	}

}
