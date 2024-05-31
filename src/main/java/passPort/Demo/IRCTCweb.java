package passPort.Demo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRCTCweb extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	    BaseClass.initialize();
		//Thread.sleep(10000);
		driver.get("https://www.irctc.co.in/nget/train-search");
		 // Locate the "From" dropdown input field
        WebElement fromInput = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
        //BaseClass.explicitWaitClick(fromInput);
        
        fromInput.sendKeys("ind");
        BaseClass.explicitWaitClick(fromInput);
        // Use the Actions class to move to the "From" input field and click it
        
        Actions actions = new Actions(driver);
        actions.moveToElement(fromInput).click().perform();
        actions.moveToElement(fromInput).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN) .sendKeys(Keys.ENTER).perform();
     
       WebElement toInput= driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
       actions.moveToElement(toInput).click();
//       
     //  BaseClass.explicitWaitClick(toInput);
       toInput.sendKeys("jab");
       BaseClass.explicitWaitClick(toInput);
       actions.moveToElement(toInput).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
      WebElement staticDropdown=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]"));
      staticDropdown.click();
//       Select dropdown=new Select(staticDropdown); 
//       dropdown.selectByVisibleText("LOWER BERTH/SR.CITIZEN");
      driver.findElement(By.xpath("//span[text()='LOWER BERTH/SR.CITIZEN']")).click();
     //  driver.switchTo().alert();
      driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
      driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).click();
      WebDriverWait wait2 	= new WebDriverWait(driver,Duration.ofMillis(2000));
      driver.findElement(By.xpath("//a[text()='13']")).click();
      driver.findElement(By.xpath("//span[text()='OK']")).click();
      driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down']")).click();
      driver.findElement(By.xpath("//span[text()='AC First Class (1A) ']")).click();
	}
}

