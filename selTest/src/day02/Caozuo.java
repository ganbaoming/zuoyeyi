package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Caozuo {
@Test
public void open() throws InterruptedException {
	//打开浏览器
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//输入网址
	String url="file:///D:/html/index.html";
	//用浏览器打开网址
	driver.get(url);
	WebElement input=driver.findElement(By.id("user"));
	//输入内容
	input.sendKeys("控件操作");
	WebElement select=driver.findElement(By.id("moreSelect"));
	Select select1=new Select(select);
	//第一种方式，按照索引来选，第一个选择的内容从0开始
	//select1.selectByIndex(3);
	//第二种方式，by value
	//select1.selectByValue("xiaomi");
	//第三种方式，通过可见的值
	select1.selectByVisibleText("huawei");
	//单选框
	WebElement r=driver.findElement(By.className("Volvo"));
	//打印是否选择了
		System.out.println(r.isSelected());
	r.click();
	System.out.println(r.isSelected());
	//复选框
	WebElement r1=driver.findElement(By.name("checkbox1"));
	//如果按钮没有被选择，那么就选择他
	if(!r1.isSelected()) {
	r1.click();}
	WebElement r2=driver.findElement(By.name("checkbox2"));
	r2.click();
	
	WebElement b1=driver.findElement(By.name("buttonhtml"));
	System.out.println(b1.isSelected());
	
	//点击alert按钮
	WebElement a1=driver.findElement(By.className("alert"));
	a1.click();
	Thread.sleep(1000);
	//从浏览器跳转到弹出框上面去
	Alert alert=driver.switchTo().alert();
	Thread.sleep(1000);
	alert.accept();
	
	WebElement co1=driver.findElement(By.className("confirm"));
	co1.click();
	Alert cl1=driver.switchTo().alert();
	cl1.accept();//确定
	Thread.sleep(1000);
	cl1.dismiss();//取消
	
	//输入后再点击按钮
//	WebElement p1=driver.findElement(By.className("prompt"));
//	p1.click();
//	
//	Thread.sleep(1000);
//	
//	Alert pp1=driver.switchTo().alert();
//	Thread.sleep(1000);
//	pp1.sendKeys("王导");
//	
//	String aa=pp1.getText();
//	System.out.println(aa);
//	
//	pp1.accept();
//	Thread.sleep(1000);
//	pp1.accept();
//	
	//定义文件的路径
	String lu="D:\\selenium\\selenium总作业";
	WebElement up=driver.findElement(By.id("load"));
	up.sendKeys(lu);
}
}
