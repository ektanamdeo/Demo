package passPort.Demo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphone {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
//	driver.get("https://www.vijaysales.com/mobiles-and-tablets/type/buy-iphones-mobile-phone");
////	Thread.sleep(3000);
////	Alert alert = driver.switchTo().alert();
////	alert.accept();
//	List<WebElement> name= driver.findElements(By.xpath("//div[@class='BcktPrdNm_']//h2"));
//	List<WebElement> prize= driver.findElements(By.xpath("//div[@class='BcktPrdNm_']//span[@class='prdvsprc_ ']"));
//	for(int i=1; i<name.size();i++)
//	{
//		String phonename=name.get(i).getText();
//		String phoneprize=prize.get(i).getText();
//		System.out.print(phonename+" ");
//		System.out.println();
//		System.out.println(phoneprize+" ");
//	}
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//form[@class='_2rslOn header-form-search']")).sendKeys("iphone 15 pro ");
driver.findElement(By.xpath("//button[@type='submit']")).click();
String nameofproduct=driver.findElement(By.xpath("//div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp']/div/div/div/div/a/div/following-sibling::div/div/div[@class='KzDlHZ']")).getText();
System.out.println(nameofproduct);

	
	
	
}
}
