package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) {
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftware\\chromedriver_108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

}
