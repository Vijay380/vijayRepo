package script;

import java.lang.reflect.Array;
import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Fancheap {
	@Test
	public void testFancheap(){
		for(int i=0;i<=5;i++){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://fancheap.com/");
		driver.findElement(By.xpath("(//a[text()='Contact us'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_1']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_2']")).sendKeys("vijaykumar.1434@gmail.com");
		driver.findElement(By.xpath("//textarea [@id='ninja_forms_field_3']")).sendKeys("http://www.buy-photo-likes.com");
		driver.findElement(By.xpath("//input[@id='ninja_forms_field_4']")).click();
		driver.close();		
		}		
				
		
	}

}
