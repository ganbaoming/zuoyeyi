package day03;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baidu1 {
	@Test
	public void open() throws InterruptedException {
		//´ò¿ªä¯ÀÀÆ÷
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url="http:www.baidu.com";
		driver.get(url);
		WebElement a=driver.findElement(By.name("tj_briicon"));
		Actions aa=new Actions(driver);
		aa.moveToElement(a).perform();
		driver.findElement(By.name("tj_nuomi")).click();
}
}