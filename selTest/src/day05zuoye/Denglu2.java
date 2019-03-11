package day05zuoye;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Denglu2 {
	@Test
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//进入网址
		String url="http://localhost:8080/Banksys_ssh/login.jsp";
		driver.get(url);
		//用户名和密码
		WebElement a=driver.findElement(By.name("userNO"));
		a.sendKeys("1508329470158");
		WebElement a1=driver.findElement(By.name("password"));
		a1.sendKeys("123456");
		driver.findElement(By.id("loginValidate_0")).click();
		//定位到左边的边框
		driver.switchTo().frame("leftFrame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();
		//获取右边的页面
		driver.switchTo().parentFrame();
		driver.switchTo().frame("mainFrame");
		//第一次，输入比余额小的数字
		WebElement a2=driver.findElement(By.id("smoneyValidate_money"));
		a2.sendKeys("5000");
		driver.findElement(By.id("smoneyValidate_0")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("mainFrame");
		String a4=driver.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(a4);
		//获取右边的页面
		driver.switchTo().parentFrame();
				driver.switchTo().frame("mainFrame");
				//跳回左边,点击交易信息
				driver.switchTo().parentFrame();
				driver.switchTo().frame("leftFrame");
				driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
				//打印交易信息
				driver.switchTo().parentFrame();
				driver.switchTo().frame("mainFrame");
				String a5=driver.findElement(By.xpath("/html/body/center")).getText();
				System.out.println(a5);
				//点击第二次存款金额为10000
				driver.switchTo().parentFrame();
				driver.switchTo().frame("leftFrame");
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();
				//获取右边的页面
				driver.switchTo().parentFrame();
				driver.switchTo().frame("mainFrame");
				//第二次，输入比余额大的数字
				WebElement a7=driver.findElement(By.id("smoneyValidate_money"));
				a7.sendKeys("10000");
				driver.findElement(By.id("smoneyValidate_0")).click();
				//大于第二次的交易信息
				driver.switchTo().parentFrame();
				driver.switchTo().frame("mainFrame");
				String a8=driver.findElement(By.xpath("/html/body/center")).getText();
				System.out.println(a8);
				
	}
}
