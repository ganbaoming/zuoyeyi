package Kaoshi;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class student {
	@Test
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//进入网址
		String url="http://localhost:8080/Exam_ssh/";
		driver.get(url);
		/*登陆
		 * 添加考试类型
		添加试题
		-浏览试题并打印
		添加学生 浏览全部学生并打印*/
		//点击后台管理
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();
		//输入用户名和密码
		WebElement a=driver.findElement(By.id("name"));
		a.sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
		//点击添加考试类型
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
		//跳转右边的框架
		driver.switchTo().parentFrame();
		//添加试卷名称和考试时间
		driver.findElement(By.id("testName")).sendKeys("语文");
		driver.findElement(By.id("testTime")).sendKeys("8.30~11.30");
		driver.findElement(By.name("submit")).click();
		//添加试题
		driver.findElement(By.id("title")).sendKeys("历史活的最久的皇帝是谁");
		driver.findElement(By.id("choices")).sendKeys("乾隆");
		driver.findElement(By.id("standardAnswer")).sendKeys("乾隆");
		driver.findElement(By.name("submit")).click();
		//浏览试题并打印
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();
		String a2=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table")).getText();
		System.out.println(a2);
		//添加学生 浏览全部学生并打印
		driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();
		driver.findElement(By.id("id")).sendKeys("36252519981135");
		driver.findElement(By.id("realname")).sendKeys("张三");
		driver.findElement(By.id("stuNumber")).sendKeys("201700005805");
		driver.findElement(By.id("className")).sendKeys("170307");
	driver.findElement(By.id("address")).sendKeys("江西先锋");
	driver.findElement(By.id("phone")).sendKeys("18279451797");
	driver.findElement(By.id("humanId")).sendKeys("36252519981135");
	driver.findElement(By.name("submit")).click();
	//添加学生 浏览全部学生并打印
	driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();
	WebElement a3=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table"));
	System.out.println(a3);
	}
}
