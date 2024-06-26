package utilities;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.MainClass;

public class testUtil {

	public static String mailscreenshotpath;

	public static void captureScreenshot(String methodName) throws IOException {

		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		int date = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH + 1);//Gregorian Calendar is one month minus the current month
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		File scrFile = ((TakesScreenshot)MainClass.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			mailscreenshotpath = System.getProperty("user.dir") + "\\Screenshot\\" + methodName + "_" + year + "_"
					+ date + "_" + (month) + "_" + hour + "_" + min + "_" + sec + ".jpeg";
			FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	// make zip of reports
	public static void zip(String filepath) {
		try {
			File inFolder = new File(filepath);
			File outFolder = new File("Reports.zip");
			ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
			BufferedInputStream in = null;
			byte[] data = new byte[1000];
			String files[] = inFolder.list();
			for (int i = 0; i < files.length; i++) {
				in = new BufferedInputStream(new FileInputStream(inFolder.getPath() + "/" + files[i]), 1000);
				out.putNextEntry(new ZipEntry(files[i]));
				int count;
				while ((count = in.read(data, 0, 1000)) != -1) {
					out.write(data, 0, count);
				}
				out.closeEntry();
			}
			out.flush();
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
