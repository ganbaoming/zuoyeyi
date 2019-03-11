package day03;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baidu {
	@Test
	public void open() throws InterruptedException {
		//´ò¿ªä¯ÀÀÆ÷
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url="http:www.baidu.com";
		driver.get(url);
		WebElement a=driver.findElement(By.name("wd"));
		Actions aa=new Actions(driver);
		aa.contextClick(a).perform();
		Thread.sleep(2000);
		File jietu=((TakesScreenshot)driver).getScreenshotAs
				(OutputType.FILE);
		try {
			FileUtils.copyFile(jietu, new File("D:\\selenium\\Ò³Ãæ\\1.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
