package screnshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static WebDriver launchApp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftware\\chromedriver_108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
public static void captureScreenshot(WebDriver driver, String fileName) throws IOException 
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File(".\\Screenshots\\"+fileName+".png"));
}

public static void loginToApplication(WebDriver driver, String userName, String passwd)
{
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(passwd);
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
}
public static String getPageTitle(WebDriver driver)
{
	return getPageTitle(driver);
}
}
