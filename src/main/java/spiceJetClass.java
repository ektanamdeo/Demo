import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class spiceJetClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep')]//input[@autocapitalize='sentences'])[1]")).sendKeys("Amritsar");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Bhopal']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']"));
	    List<WebElement> monthValue = driver.findElements(By.xpath("//div[contains(@class,'r-k8qxaj')]"));
	    for (WebElement monthYear : monthValue) {
	    	if (monthYear.getText().contains("August 2024")){
				monthYear.click();
				break;
			}
	    	else {
	    		actions.moveToElement(ele).click().build().perform();   
	    	}	
		}
	    driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-day-25'])[8]")).click();
	    driver.findElement(By.xpath("//div[text()='Passengers']")).click();
	    ////div[@data-testid='Adult-testID-plus-one-cta']
	    for(int i=0;i<5;i++)
	    {
	    	driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	    }
	    driver.findElement(By.xpath("((//div[text()='Currency']/parent::div/child::div)[2]/div)[2]")).click();
	    driver.findElement(By.xpath("//div[text()='USD']")).click();
	    driver.findElement(By.xpath("//div[text()='Armed Forces']")).click();
	    //driver.findElement(By.xpath("//div[text()='Search Flight']")).click();
	    WebElement move=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1rngwi6 r-o9xkwf'])[2]"));
	    actions.moveToElement(move).perform();
	    Thread.sleep(2000);
	    WebElement ele1 = driver.findElement(By.xpath("//div[text()='Benefits']"));
	    actions.moveToElement(ele1).click().perform();
        Set<String> windows = driver.getWindowHandles();//now both website open is present in this windows
        java.util.Iterator<String> it=windows.iterator();
        String parentId=it.next();
        System.out.println(parentId);
        String childId=it.next();
        System.out.println(childId);
        driver.switchTo().window(parentId);
        int size=driver.findElements(By.tagName("iframe")).size();
        System.out.println("frames in website    "+size);
        driver.switchTo().frame((WebElement) driver.findElements(By.tagName("iframe")));
        System.out.println("no. of links present    "+driver.findElements(By.tagName("a")).size());
        
        
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
// 		List<WebElement> originCity = driver.findElements(By.xpath("//div[contains(@class,'css-1dbjc4n r-knv0ih r-1k1q3bj')]"));		
		//		for (WebElement city : originCity) {
//			String cityName= city.getText();
//			if (cityName.equalsIgnoreCase("Amritsar")) {
//				System.out.println("Vedant");
//				break;
//			}
//			
//		}
//		System.out.println("No name matched");

	}

