package day04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyword {
	@Test
	public void open() throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
	driver.get(url);
	/*1.进入网址
	2.点击ctrl+s
	3.点击取消*/
	
	WebElement select=driver.findElement(By.id("user"));

	Robot aa=new Robot();
	//点击ctrl
	aa.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	//点击s
	aa.keyPress(KeyEvent.VK_S);
	Thread.sleep(2000);
	//放开s
	aa.keyRelease(KeyEvent.VK_S);
	Thread.sleep(2000);
	//放开ctrl
	Thread.sleep(2000);
	aa.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	
	aa.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(2000);
	}
}
