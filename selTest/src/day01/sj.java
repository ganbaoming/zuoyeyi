package day01;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sj {
	@Test
public void open() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://localhost:8080/mobile_mysql/index.jsp";
	driver.get(url1);
	WebElement input=driver.findElement(By.name("name"));
	input.sendKeys("Íõµ¼");
	WebElement input1=driver.findElement(By.name("password"));
	input1.sendKeys("123456");
	WebElement bution=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input"));
	bution.click();
}
}
