package useractions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartDemo {

	public static void main(String[] args) throws InterruptedException {
		String url="https://www.flipkart.com/";
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftware\\chromedriver_108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement closebutton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(closebutton));
		closebutton.click();

		Actions actions=new Actions(driver);

		WebElement fashion=driver.findElement(By.xpath("//div[text()='Fashion']"));
		Action moveToFashionMenu=actions.moveToElement(fashion).build();
		moveToFashionMenu.perform();

		WebElement menFootwear=driver.findElement(By.xpath("//a[contains(@href, 'mens-footwear')]"));
		Action moveToMenFootwear=actions.moveToElement(menFootwear).build();
		moveToMenFootwear.perform();

		WebElement sportShoes=driver.findElement(By.xpath("//a[contains(@href, 'sports-shoes')]"));
		Action clickOnSportShoes=actions.moveToElement(sportShoes).click(sportShoes).build();
		clickOnSportShoes.perform();

		Thread.sleep(3000);

		//driver.close();
	}

}
