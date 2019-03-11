package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Choujiang {
	@Test
	public void open() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="https://www.baidu.com";
	driver.get(url1);
//String title1=driver.getTitle();
//	System.out.println(title1);

//	String url3=driver.getCurrentUrl();
//	System.out.println(url3);
//	WebElement input=driver.findElement(By.className("s_ipt"));
//	input.sendKeys("Èí¼þ²âÊÔ");
//WebElement butin=driver.findElement(By.id("su"));
//	butin.clear();
//	driver.navigate().back();
//	driver.navigate().back();
driver.findElement(By.linkText("ÐÂÎÅ")).click();
driver.findElement(By.cssSelector("#imgView > a > img")).click();	
//	driver.findElement(By.linkText("hao123")).click();
//	
//	int a=driver.findElements(By.tagName("a")).size();
//    System.out.println(a);
	}
}