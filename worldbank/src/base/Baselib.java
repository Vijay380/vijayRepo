package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baselib {
	protected WebDriver driver;
	@BeforeTest
	public void preconfig(){
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.worldbank.org/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}

}
