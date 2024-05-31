package passPort.Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {


	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void initialize() {
		driver = new ChromeDriver();
		driver.manage().window();
		driver.get("https://www.irctc.co.in/nget/train-search");
	}
	
	public static void explicitWaitClick(WebElement element) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
}
