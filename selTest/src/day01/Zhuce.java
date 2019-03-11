package day01;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Zhuce {
@Test
public void open() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://localhost:8080/mobile_mysql/index.jsp";
	driver.get(url1);
	driver.findElement(By.linkText("注册")).click();
	WebElement input=driver.findElement(By.name("name"));
	input.sendKeys("王导你好啊");
	WebElement input1=driver.findElement(By.name("password"));
	input1.sendKeys("12345");
	WebElement input2=driver.findElement(By.name("passwordOne"));
	input2.sendKeys("12345");
	WebElement input3=driver.findElement(By.name("reallyName"));
	input3.sendKeys("王老板");
	WebElement input4=driver.findElement(By.name("age"));
	input4.sendKeys("21");
	WebElement input5=driver.findElement(By.name("profession"));
	input5.sendKeys("学生");
	WebElement input6=driver.findElement(By.name("email"));
	input6.sendKeys("3066307402@qq.com");
	WebElement input7=driver.findElement(By.name("question"));
	input7.sendKeys("我王导牛逼？");
	WebElement input8=driver.findElement(By.name("result"));
	input8.sendKeys("牛啊");
	WebElement bution=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/input"));
	bution.click();
}
}
