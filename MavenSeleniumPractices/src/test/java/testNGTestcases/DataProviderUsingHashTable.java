package testNGTestcases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class DataProviderUsingHashTable {

	public ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void doLogin(Hashtable<String, String> data) {
		System.out.println(data.get("username"));
	}

	@DataProvider
	public Object[][] getData() {
		// Creating object of utility Class ExcelReader
		if (excel == null) {
			excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\testData.xlsx");
		}

		String sheetName = "loginData";
		// Getting row count
		int rowCount = excel.getRowCount(sheetName);

		// Getting column count
		int colCount = excel.getColumnCount(sheetName);

		// Creating object of double dimensional Object array
		Object[][] data = new Object[rowCount - 1][1];

		// Initializing Hashtable
		Hashtable<String, String> table = null;

		// iterate each and every row and column
		for (int rows = 2; rows <= rowCount; rows++) {
			
			//Creating object of Hashtable so that for every row a new Hashtable gets created
			table = new Hashtable<String, String>();

			for (int cols = 0; cols < colCount; cols++) {
				table.put(excel.getCellData(sheetName, cols, 1), excel.getCellData(sheetName, cols, rows));
				data[rows - 2][0] = table;
			}
		}
		
		return data;

	}

	
}
