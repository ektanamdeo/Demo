package passPort.Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class traverlcompany {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date]']")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(30, -700);");
	        Thread.sleep(3000);
		Actions actions = new Actions(driver);
       // WebElement element = driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date"));
       // actions.moveToElement(element).click().perform();
        actions.moveToElement(new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='form_fields[travel_comp_date]']")))).build().perform();
//        element.click();
//		driver.findElement(By.xpath("//div[@class='flatpickr-month']")).click();
//		while(!driver.findElement(By.xpath("//span[@class='cur-month']")).getText().contains("August"));
//		{
//			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
//		}
//	        driver.findElement(By.xpath("//span[text()='25']")).click();
	}}

