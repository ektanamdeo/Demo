package ggggg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 15 pros");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	List<WebElement> name = driver.findElements(By.xpath(
			"//div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp']/div/div/div/div/a/div/following-sibling::div/div/div[@class='KzDlHZ']"));
	List<WebElement> prize = driver.findElements(By.xpath(
			"//div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp']/div/div/div/div/a/div/following-sibling::div/div/following-sibling::div/div/div/div[@class='Nx9bqj _4b5DiR']"));

	WebElement a = driver.findElement(By.xpath("//span[text()='Next']"));
	if (a.isDisplayed()) {
		for (int i = 1; i < name.size(); i++) {
			String phonename = name.get(i).getText();
			String phoneprize = prize.get(i).getText();
			System.out.print(phonename + " ");
			System.out.println();
			System.out.println(phoneprize + " ");
		}
	}
}
}
