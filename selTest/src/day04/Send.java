package day04;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Send {

	@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
	driver.get(url);
	
	WebElement select=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
	
	List<WebElement> option=select.findElements(By.tagName("option"));
	Actions aa=new Actions(driver);
	
	//aa.keyDown(Keys.CONTROL)
	
	aa.keyDown(Keys.SHIFT)
	.click(option.get(0)).click(option.get(2)).perform();
	
	
	}
}
