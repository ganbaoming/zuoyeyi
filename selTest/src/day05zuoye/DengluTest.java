package day05zuoye;

import java.awt.AWTException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DengluTest {
	
	static WebDriver dr;
	static String ur1;
	@BeforeClass //每个测试方法运行之前运行
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		 dr=new ChromeDriver();
		ur1="http://localhost:8080/Banksys_ssh/";
	}
	
	/*
	 * 1,打开网址
	 * 2，输入用户名
	 * 3，输入密码
	 * 4，点击登录
	 */
	@Test
	public void login() throws InterruptedException  {
		dr.get(ur1);
		
		//输入用户名
		WebElement input1=dr.findElement(By.name("userNO"));
		input1.sendKeys("1508329470158");	
		//输入密码
		WebElement input2=dr.findElement(By.name("password"));
		input2.sendKeys("123456");		
		//点击登录按钮
		dr.findElement(By.id("loginValidate_0")).click();
		Thread.sleep(1000);
	}
	@Test //取款
	public void qukuan1() throws InterruptedException {
		//跳转左边框架，点击菜单
		dr.switchTo().frame("leftFrame");
		dr.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		//跳转至右边框架
		dr.switchTo().parentFrame();
		dr.switchTo().frame("mainFrame");
		/**第一次，输入比余额小的数字，再打印交易信息。*/
		dr.findElement(By.name("money")).sendKeys("1000");		
		dr.findElement(By.id("fmoneyValidate_0")).click();
		Thread.sleep(1000);
	
		//点击交易信息
		dr.switchTo().parentFrame();
		dr.switchTo().frame("leftFrame");
		dr.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		Thread.sleep(1000);	
	
		//打印交易信息
		dr.switchTo().parentFrame();
		dr.switchTo().frame("mainFrame");
		String w=dr.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(w);
		Thread.sleep(1000);
	}
		/**第二次，输入大于余额的数字，打印错误提示。
		 * @throws InterruptedException */
	@Test
	public void qukuan2() throws InterruptedException {
		//点击我要取款
		dr.switchTo().parentFrame();
		dr.switchTo().frame("leftFrame");
		dr.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		//输入取款金额 
		dr.switchTo().parentFrame();
		dr.switchTo().frame("mainFrame");
		//输入10000
		dr.findElement(By.name("money")).sendKeys("100000");		
		dr.findElement(By.id("fmoneyValidate_0")).click();
		Thread.sleep(1000);
		//打印错误信息
		String y=dr.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(y);
	}

	
	@AfterClass //每个测试方法运行之后运行
	public static void after(){
		dr.switchTo().parentFrame();
		dr.switchTo().frame("leftFrame");
		dr.findElement(By.xpath("/html/body/p[7]/a/img")).click();
		
		dr.findElement(By.xpath("/html/body/center/a")).click();
	}

}
