package common;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Screenshot extends DriverFactory {
	
	
	public static void getScreenshot() {
		
		Date currentDate = new Date();
		
		String FileName = "SauceDemo" + currentDate.toString().replace(" ", "-").replace(":", "-");
		File F =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(F, new File(".//Screenshot//"+FileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
