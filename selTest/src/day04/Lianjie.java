package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lianjie {
	@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/link.html";
	driver.get(url);
	driver.findElement(By.xpath("/html/body/a[1]")).click();
	String url1="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/continue.html";
	driver.get(url1);
	driver.findElement(By.xpath("/html/body/a[2]")).click();
	String url2="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/cancel.html";
	driver.get(url2);
	driver.findElement(By.xpath("/html/body/a[2]")).click();
	driver.findElement(By.xpath("/html/body/a[1]")).click();
	
	
}
}