package day03;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac2 {
	@Test
	public void open() throws InterruptedException {
		//打开浏览器
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		//打开新的页签
		/*
		 * 1.打开index页面
		 * 2.定位到action按钮
		 * 3.把鼠标移动到该按钮
		 * */
		driver.get(url);
		WebElement a=driver.findElement(By.className("over"));
		Actions aa=new Actions(driver);
		aa.moveToElement(a).perform();
		String h=driver.findElement(By.className("over")).getText();
		System.out.println(h);
}}
