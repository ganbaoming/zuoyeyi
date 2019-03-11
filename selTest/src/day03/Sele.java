package day03;


import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
	driver.get(url);
	//打开了新的页签
	String dq=driver.getWindowHandle();
	driver.findElement(By.linkText("Open new window")).click();
	/*
	 * 
	 * */
	//获取当前页面所有的句柄，当前有两个页面，所以用了一个字符串集合来接收两个句柄
	Set<String>w=driver.getWindowHandles();
	//随机在句柄集合中，选择一个句柄
	for(String handle:w) {
		driver.switchTo().window(handle);//转到该句柄去
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		//通过标题判断，所获取的页面是否实我想要的
		//如果是我想要的，就对该页面，进行操作
		if("UIAutomation iFrame".equals(title)){
		Thread.sleep(1000);	
			driver.findElement(By.id("user")).sendKeys("王导");
			//driver.findElement(By.linkText("baidu")).click();
			//break;
		}
		driver.switchTo().window(dq);//转到该句柄去
		Thread.sleep(1000);
		String title1=driver.getTitle();
		if("UIAutomation iFrame".equals(title)){
			Thread.sleep(1000);	
			WebElement a=driver.findElement(By.id("user"));
			a.sendKeys("王军");
	}
	
}
}
}
