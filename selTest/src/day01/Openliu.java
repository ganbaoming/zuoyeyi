package day01;

import java.awt.Dimension;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Openliu {
	@Test
	public void open() throws InterruptedException{
		//打开火狐浏览器
		//System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//打开网址
		String url1="https://www.baidu.com";
		String url2="http://www.v2ex.com";
		driver.get(url1);
		//窗口最大化
		driver.manage().window().maximize();
		//设置浏览器大小
		//Dimension dimension=new Dimension(500,800);
		//driver.manage().window().setSize(dimension);
		//刷新页面
		driver.navigate().refresh();
		
		driver.navigate().to(url2);
		//后退页面
		driver.navigate().back();
		//执行完成后，返回百度页面
		//打印标题
		String title1=driver.getTitle();
		System.out.println(title1);
		//打印当前的网址
		String url3=driver.getCurrentUrl();
		System.out.println(url3);
		
		Thread.sleep(100000);
		
		driver.navigate().forward();
		//打印标题
		String title2=driver.getTitle();
		System.out.println(title2);
		//打印当前的网址
				String url4=driver.getCurrentUrl();
				System.out.println(url4);
	}
}
