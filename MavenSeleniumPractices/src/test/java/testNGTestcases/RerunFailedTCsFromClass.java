package testNGTestcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class RerunFailedTCsFromClass {

	@Test
	public static void main(String[] args) {

		TestNG runner = new TestNG();
		List<String> list = new ArrayList<String>();

		list.add("C:\\Dushyant\\My_Workplace\\MavenSeleniumPractices\\test-output\\testng-failed.xml");

		runner.setTestSuites(list);
		runner.run();

	}

}
