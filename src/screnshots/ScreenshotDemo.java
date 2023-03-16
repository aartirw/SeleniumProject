package screnshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		String base="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

		driver=Utility.launchApp(base);
		Utility.loginToApplication(driver, "Tester", "test");
		Utility.captureScreenshot(driver, "login");
		System.out.println(Utility.getPageTitle(driver));
		Utility.captureScreenshot(driver, "home");
		/*
		 * source=ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(source, new
		 * File(".\\Screenshots\\home.png"));
		 */
		driver.quit();
	}

}
