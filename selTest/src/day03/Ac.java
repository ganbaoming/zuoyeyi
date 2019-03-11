package day03;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac {
	@Test
	public void open() throws InterruptedException {
		//打开浏览器
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(url);
		/*
		 * 1.进图index页面
		 * 2.找到输入框
		 * 3.点击右键
		 * */
		WebElement input=driver.findElement(By.id("user"));
		Actions a=new Actions(driver);
		//右击的参数
		//a.contextClick(input).perform();
		
		Thread.sleep(2000);
		//右击的无参
		a.contextClick().perform();
		
	}
}
