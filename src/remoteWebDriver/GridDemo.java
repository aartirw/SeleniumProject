package remoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		String bseurl="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		WebDriver driver;

		URL url= new URL(" http://192.168.29.8:4444/grid/register/");

		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("chrome");

		driver=new RemoteWebDriver(url, capabilities);

		driver.manage().window().maximize();
		driver.get(bseurl);

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(3000);

		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Logout")).click();
		

	}
}
