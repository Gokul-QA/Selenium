package Tested;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	long starttime;
	long endtime;
	@BeforeSuite
	public void launch() {
		starttime=System.currentTimeMillis();
		//System.setProperty("webdriver.chrome.driver","/home/schnell/Videos/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void Qa() {
		driver.get("http://qa.xserp.in/erp");
	}
	@Test
	public void Uat() {
		driver.get("http://uat.xserp.in/erp");
	}
	@Test
	public void production() {
		driver.get("https://xserp.in/erp");
	}
	@AfterSuite
	public void End() {
		endtime=System.currentTimeMillis();
		driver.quit();
		System.out.println(starttime-endtime);
	}


}
