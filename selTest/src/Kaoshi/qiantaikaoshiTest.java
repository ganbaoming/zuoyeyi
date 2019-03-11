package Kaoshi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class qiantaikaoshiTest {
	WebDriver driver;
	String url1;
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://localhost:8080/Exam_ssh/";
	driver.get(url1);
	/*2,前台
	登陆-进行一次考试*/
	//进入开始考试页面
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
	//输入学号和姓名
	driver.findElement(By.name("stuNumber")).sendKeys("201700005805");
	driver.findElement(By.name("stuName")).sendKeys("张三");
	//点击提交
	driver.findElement(By.name("B1")).click();
	//点击开始按钮
	driver.findElement(By.name("start_b")).click();
	//勾选
	  driver.findElement(By.name("questionOption")).click();
	 //提交
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
  }
}
