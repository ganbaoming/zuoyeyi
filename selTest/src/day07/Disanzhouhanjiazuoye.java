package day07;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Disanzhouhanjiazuoye {
	static WebDriver driver;
	static String url;
	@BeforeClass
	public static void open () {
		/*1、 访问Qunar机票首页http://flight.qunar.com，选择“单程”，输入出发、到达城市，选择today+7日后的日期，点“搜索”，跳转到机票单程搜索列表页。
			 
			2、 在列表页停留1分钟，至到页面上出现“搜索结束”。

			3、 如果出现航班列表，对于出现“每段航班均需缴纳税费”的行随机点选“订票”按钮，在展开的列表中会出现“第一程”、 “第二程”；对于没有出现“每段航班均需缴纳税费”的行随机点选“订票”按钮，在展开的列表底部中会出现“报价范围” 
			4、 如果不出现航班列表，则页面会出现“该航线当前无可售航班”*/

	//打开浏览器
	System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
	driver = new ChromeDriver();
	url = " http://flight.qunar.com";
	}
	@Test
	public void login() {
		// 访问Qunar机票首页http://flight.qunar.com，选择“单程”，输入出发、到达城市，选择today+7日后的日期，点“搜索”，跳转到机票单程搜索列表页。
	driver.get(url);
	driver.findElement(By.xpath("//*[@id=\"js_lab_sng\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[1]/div[3]/b")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[1]/span[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[5]/dl[4]/dd/ul/li[6]/a")).click();

	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[1]/div[3]/b")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/span[5]")).click();
	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[6]/dl[3]/dd/ul/li[5]/a")).click();

	driver.findElement( By.id("//*[@id=\"dfsForm\"]/div[3]/div[1]/div/div[1]/div[3]/span")).click();
	driver.findElement(By.linkText("搜索")).click();
	}
	@AfterClass
	public static void close() {


	}
}