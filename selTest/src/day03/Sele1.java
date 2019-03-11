package day03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {
	@Test
	public void open() throws InterruptedException {
		//打开浏览器
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//输入网址
		String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/index.html";
		//用浏览器打开网址
		driver.get(url);
		/*
		 * 1.切换到小页面
		 * 2.定位小页面里面的内容
		 * 3.操作小页面中的元素
		 */
		//切换到小页面中去
		//2中切换方式
		//第一种：括号中，直接写上frame标签的id和name
//		driver.switchTo().frame("aa");
//		driver.findElement(By.id("user")).sendKeys("王导");
		//第二张，索引
		driver.switchTo().frame(0);
		driver.findElement(By.id("user")).sendKeys("王导");
		Thread.sleep(2000);
		//跳回到主页面，也有两种方式
		//跳回到父类页面
		//主页面---iframe--iframe
		//driver.switchTo().parentFrame();
		//直接跳转最外层
		driver.switchTo().defaultContent();
		driver.findElement(By.id("user")).sendKeys("test");
		
}
}