package passPort.Demo;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		String productName = sc.next();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.vijaysales.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@id='CatHDesktopliPersonalCare']"))).build().perform();
        //div[@data-cat='Personal Care']/div//div[@class='col5_1 dm_']/div/a
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='row_ menuhover']//a[text()='"+productName+"']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='BcktPrd']/a/h2"));
		for (int j = 0; j < ele.size(); j++) {
		String productname = ele.get(j).getText();
		System.out.println(productname);
		}
	}	
	}	
		
		
		

