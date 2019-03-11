package day03;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele2 {
	@Test
	public void open() throws InterruptedException {
		//打开浏览器
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//输入网址
		//String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/main.html";
		String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/frame.html";
		//String url="http:www.baidu.com";
		//用浏览器打开网址
		driver.get(url);
//		WebElement input=driver.findElement(By.id("input1"));
//		input.sendKeys("你好真香");
//		driver.switchTo().parentFrame();
//		String a=driver.findElement(By.id("div1")).getText();
//		System.out.println(a);
		//selenium截图
		File jietu=((TakesScreenshot)driver).getScreenshotAs
				(OutputType.FILE);
		try {
			FileUtils.copyFile(jietu, new File("D:\\selenium\\页面\\1.1.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		driver.switchTo().frame("frame");
		WebElement input=driver.findElement(By.id("input1"));
		input.sendKeys("明天更好");
		driver.switchTo().defaultContent();
		String b=driver.findElement(By.id("id1")).getText();
		System.out.println(b);
		
}
}