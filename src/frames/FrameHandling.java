package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		String url="https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html";
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftware\\chromedriver_108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.close();
	}

}
