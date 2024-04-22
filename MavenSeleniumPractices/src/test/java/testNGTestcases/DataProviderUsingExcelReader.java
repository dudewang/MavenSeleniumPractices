package testNGTestcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class DataProviderUsingExcelReader {
	
	public ExcelReader excel=null;
	
	@Test(dataProvider="getData")
	public void doLogin(String username, String password, String is_correct)
	{
		System.out.println(username + " " + password + " " +is_correct);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		try
		{
		if(excel==null)
		{
			excel=new ExcelReader(System.getProperty("user.dir")+ "\\src\\test\\java\\utilities\\testData.xlsx");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
		
		String sheetName = "loginData";
		
		//Get row count
		int rowCount = excel.getRowCount(sheetName);
		System.out.println(rowCount);
		
		//Get column count
		int colCount = excel.getColumnCount(sheetName);
		
		//Create object of double dimensional array Object
		Object[][] data = new Object[rowCount-1][3];
		
		//iterate each and every row and column
		for(int rows=2; rows<=rowCount; rows++)
		{
			for(int cols=0; cols<colCount; cols++)
			{
				data[rows-2][cols]=excel.getCellData(sheetName, cols, rows); 
			}
		}
		return data;
		
	}
	
}
