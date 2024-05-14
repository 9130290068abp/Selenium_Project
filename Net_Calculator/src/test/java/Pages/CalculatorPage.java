package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
	
	WebDriver driver = null;
	
	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
	}
	@FindBy (xpath = "//span[text()='1']")
	public WebElement num1;
	
	@FindBy (xpath = "//span[text()='2']]")
	public WebElement num2;
	
	@FindBy (xpath = "//span[text()='3']")
	public WebElement num3;
	
	@FindBy (xpath = "//span[text()='4']")
	public WebElement num4;
	
	@FindBy (xpath = "//span[text()='5']")
	public WebElement num5;
	
	@FindBy (xpath = "//span[text()='6']")
	public WebElement num6;
	
	@FindBy (xpath = "//span[text()='7']")
	public WebElement num7;
	
	@FindBy (xpath = "//span[text()='8']")
	public WebElement num8;
	
	@FindBy (xpath = "//span[text()='9']")
	public WebElement num9;
	
	@FindBy (xpath = "//span[text()='0']")
	public WebElement num0;

	@FindBy (xpath = "//span[text()='.']")
	public WebElement decimal;
	
	@FindBy (xpath = "//span[text()='+']")
	public WebElement add;
	
	@FindBy (xpath = "//span[text()='–']")
	public WebElement minus;
	
	@FindBy (xpath = "//span[text()='×']")
	public WebElement multiply;
	
	@FindBy (xpath = "//span[text()='/']")
	public WebElement divide;
	
	@FindBy (xpath = "//span[text()='=']")
	public WebElement equal;
	
	@FindBy (xpath = "//span[text()='Back']")
	public WebElement back;
	
	@FindBy (xpath = "//span[text()='–']")
	public WebElement negative;
	
	@FindBy (xpath = "//div[@id='sciOutPut']")
	public WebElement result;
	
	@FindBy (id = "sciInPut")
	public WebElement input; 
	
	
	
	
	
	
}
