package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HommePage {
	WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Countries'])[2]")
	private WebElement country;

	public WebElement getCountry() {
		return country;
	}

	
	public HommePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
