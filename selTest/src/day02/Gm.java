package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gm {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://localhost:8080/mobile_mysql/bg-resultTen.jsp";
	driver.get(url1);
	WebElement username=driver.findElement(By.name("name"));
	username.sendKeys("王导");
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("123");
	WebElement bution=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input"));
	bution.click();
	driver.findElement(By.cssSelector("body > table:nth-child(7) > tbody > tr > td:nth-child(2) > table:nth-child(2) > tbody > tr > td > a:nth-child(1)")).click();
	driver.findElement(By.cssSelector("body > table:nth-child(7) > tbody > tr > td:nth-child(2) > table:nth-child(4) > tbody > tr:nth-child(4) > td > div > a")).click();
	String url2="http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=11";
	driver.get(url2);
	driver.findElement(By.name("Submit")).click();
	driver.manage().window().maximize();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(1000);
	alert.accept();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td[6]/a")).click();
	driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[2]/table[2]/tbody/tr[3]/td/a[2]")).click();
	WebElement name=driver.findElement(By.name("address"));
	name.sendKeys("江西先锋");
	WebElement a=driver.findElement(By.name("tel"));
	a.sendKeys("18279451797");
	WebElement s=driver.findElement(By.name("setMoney"));
	Select s1=new Select(s);
	s1.selectByVisibleText("支付宝支付");
	WebElement x=driver.findElement(By.name("post"));
	Select x1=new Select(x);
	x1.selectByVisibleText("特快专递");
	WebElement name1=driver.findElement(By.name("bz"));
	name1.sendKeys("王导就是牛啊");
	driver.findElement(By.name("Submit2")).click();
	Alert alert1=driver.switchTo().alert();
	Thread.sleep(1000);
	alert1.accept();
}
}
