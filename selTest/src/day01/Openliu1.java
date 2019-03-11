package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openliu1 {
	@Test
public void open() {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	String url1="https://www.baidu.com";
	driver.get(url1);
	
	String title1=driver.getTitle();
	System.out.println(title1);
	
	String url3=driver.getCurrentUrl();
	System.out.println(url3);
}
}
