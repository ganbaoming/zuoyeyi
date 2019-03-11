package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///D:/selenium/%E9%A1%B5%E9%9D%A2/dragAndDrop.html";
	driver.get(url);
	/*进入网址
	拖动红色得方块
	到第一行字上*/
WebElement f=driver.findElement(By.id("drag"));

WebElement mubiao=driver.findElement(By.xpath("/html/body/h1"));

	Actions aa=new Actions(driver);
	
	//aa.doubleClick(f).perform();
	/*aa.clickAndHold(f)
	.moveToElement(mubiao)//移动鼠标
	.release(f)//释放鼠标
	.perform();*/
	
	aa.dragAndDropBy(f, 600, -30)
	.perform();
}
}