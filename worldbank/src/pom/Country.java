package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Country {
	WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Afghanistan'])[2]")
	private WebElement afghanistan;
	public WebElement getAfghanistan(){
		
		return afghanistan;
	}
	
	@FindBy(xpath="//td[text()='32.53	million ']")
	private WebElement population;
	public WebElement getPopulation(){
		return population;
	}
	
	@FindBy(xpath="//td[text()='$19.20	billion ']")
	private WebElement gdp;
	public WebElement getgdp(){
		return gdp;
	}
	
	@FindBy(xpath="//td[text()='1.5% ']")
	private WebElement gdpGrowth;
	public WebElement getGdpGrowth(){
		return gdpGrowth;
	}
	
	
	
	public Country(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
