package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GouMai {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://localhost:8080/mobile_mysql/bg-resultTen.jsp";
	driver.get(url1);
	//用户名
	WebElement username=driver.findElement(By.name("name"));
	username.sendKeys("王导");
	//密码
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("123");
	//登录
	WebElement bution=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input"));
	bution.click();
	//点击链接苹果
	driver.findElement(By.cssSelector("body > table:nth-child(7) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr > td > a:nth-child(1)")).click();
	//查看详情内容
	driver.findElement(By.cssSelector("body > table:nth-child(7) > tbody > tr > td:nth-child(2) > table:nth-child(4) > tbody > tr:nth-child(4) > td > div > a")).click();
	//放入购物车
	String url2="http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=11";
	driver.get(url2);
	driver.findElement(By.name("Submit")).click();
	//放大页面
	driver.manage().window().maximize();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(1000);
	alert.accept();
	//返回
	driver.navigate().back();
	driver.navigate().back();
	//driver.findElement(By.cssSelector("image/2.jpg")).click();
	//进入购物车
	driver.findElement(By.linkText("购物车")).click();
	//去收银台结账
	driver.findElement(By.linkText("去收银台结账")).click();
	//输入联系地址
	WebElement DZ=driver.findElement(By.name("address"));
	DZ.sendKeys("江西先锋");
	//输入联系电话
	WebElement DH=driver.findElement(By.name("tel"));
	DH.sendKeys("18279451797");
	//付款下拉框
	WebElement s=driver.findElement(By.name("setMoney"));
	Select s1=new Select(s);
	s1.selectByVisibleText("支付宝支付");
	//运送下拉框
	WebElement x=driver.findElement(By.name("post"));
	Select x1=new Select(x);
	x1.selectByVisibleText("特快专递");
	//备注信息
	WebElement BZ=driver.findElement(By.name("bz"));
	BZ.sendKeys("南昌湾里");
	//点击提交
  driver.findElement(By.name("Submit2")).click();
    //从浏览器跳转到弹出框上面去
    Alert alert1=driver.switchTo().alert();
    Thread.sleep(1000);
    alert1.accept();
    //关闭
    Thread.sleep(2000);
   driver.quit();

}
}
