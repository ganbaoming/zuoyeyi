package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QQ {
	@Test
public void open() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="https://www.baidu.com";
	driver.get(url1);
	WebElement input=driver.findElement(By.name("wd"));
	input.sendKeys("QQ“Ù¿÷");
	WebElement bution=driver.findElement(By.id("su"));
	bution.click();
	WebElement bution1=driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a[1]"));
	bution1.click();
}
}
