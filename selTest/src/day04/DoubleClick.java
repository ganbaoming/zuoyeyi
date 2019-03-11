package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/dragAndDrop.html";
	driver.get(url);
	/*1.进入网址
	 * 2.双击红色得方块
	 * */
	WebElement f=driver.findElement(By.id("drag"));
	
	Actions aa=new Actions(driver);
	aa.doubleClick(f).perform();
	
}}
