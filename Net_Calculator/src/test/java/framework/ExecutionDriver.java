package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecutionDriver {
	public void init() {
		
	}
	public void close() {
		
	}
	public WebDriver driver = null;
	
	@BeforeSuite()
	public void boforeSuite() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.calculator.net");
		init();
	}
	@AfterSuite()
	public void afterSuite() {
		close();
	}
}
