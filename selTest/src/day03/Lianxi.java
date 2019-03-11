package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lianxi {
	@Test
	public void open() throws InterruptedException {
		//打开浏览器
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//输入网址
		String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/pop.html";
		driver.get(url);
		
		driver.findElement(By.linkText("click me")).click();
		Set<String>w=driver.getWindowHandles();
		for(String handle:w) {
			driver.switchTo().window(handle);//转到该句柄去
			Thread.sleep(1000);
			String title=driver.getTitle();
			if("百度一下，你就知道".equals(title)){
				Thread.sleep(1000);	
				WebElement a=driver.findElement(By.name("wd"));
				a.sendKeys("selenium");
				driver.findElement(By.id("su")).click();
				break;
				
}
}
	}
}
