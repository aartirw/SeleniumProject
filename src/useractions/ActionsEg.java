package useractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionsEg {

	public static void main(String[] args) {
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftware\\chromedriver_108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		driver.findElement(By.linkText("Order")).click();
		WebElement productDropDown=driver.findElement(By.id("ct100_MainContent_fmwOrder_ddlProduct"));
		WebElement txtQty=driver.findElement(By.id("ct100_MainContent_fmwOrder_txtQuantity"));
		Select product=new Select(productDropDown);
		product.selectByVisibleText("FamilyAlbum");

		Actions actions=new Actions(driver);
		Action pressTab=actions.sendKeys(Keys.TAB).build();
		pressTab.perform();

		Action pressDel=actions.sendKeys(Keys.DELETE).build();
		pressDel.perform();
		
		txtQty.sendKeys("15");
		pressTab.perform();




	}

}
