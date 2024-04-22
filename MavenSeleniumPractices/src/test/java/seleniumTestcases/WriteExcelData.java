package seleniumTestcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {
	
	static XSSFWorkbook workbook;
	
	public static void main(String[] args) throws IOException {

		File sourceFile = new File(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\userPassData.xlsx");
		
		//FileInputStream fis = new FileInputStream(sourceFile);
		
		//workbook = new XSSFWorkbook(fis);
		
		Workbook workBook = WorkbookFactory.create(sourceFile);
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		sheet1.getRow(0).createCell(3).setCellValue("Result");
		
		sheet1.getRow(1).createCell(3).setCellValue("Pass");
		
		sheet1.getRow(2).createCell(3).setCellValue("Fail");
		
		sheet1.getRow(3).createCell(3).setCellValue("Pass");
		
		FileOutputStream fout = new FileOutputStream(sourceFile);
		
		workbook.write(fout);
		
		
	}
	

}
