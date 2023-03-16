package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		String url="file:///D:/Programs/alert_demo.html";
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftware\\chromedriver_108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		
		driver.findElement(By.id("cmdClick")).click();
		Thread.sleep(1000);
		
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		
		driver.switchTo().alert().accept();
		driver.close();
		

	}

}
