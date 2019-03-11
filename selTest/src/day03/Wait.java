package day03;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {
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
		 * 2.点击wait按钮
		 * 3.打印wait按钮下方的字
		 * */
		driver.get(url);
		driver.findElement(By.className("wait")).click();
		String a=driver.findElement(By.className("red")).getText();
		System.out.println(a);
}}
