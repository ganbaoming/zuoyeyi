package day05zuoye;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DengluTestng {
	
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
  }


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
  	//我要存款
  	driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();
  	//获取右边的页面
  	driver.switchTo().parentFrame();
  	driver.switchTo().frame("mainFrame");
  	//输入存款
  	WebElement a2=driver.findElement(By.id("smoneyValidate_money"));
  	a2.sendKeys("9999");
  	driver.findElement(By.id("smoneyValidate_0")).click();
  	//跳回左边,点击交易信息
  	driver.switchTo().parentFrame();
  	driver.switchTo().frame("leftFrame");
  	driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
  	//跳回右边，打印交易信息
  	driver.switchTo().parentFrame();
  	driver.switchTo().frame("mainFrame");
  	String a4=driver.findElement(By.xpath("/html/body/center")).getText();
  	System.out.println(a4);
  }
}
