package passPort.Demo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calender {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		String text = driver.findElement(By.xpath(
				"//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[text()='Apr' and text()='2024']"))
				.getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]"));
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath("//div[text()='15']")).click();
	}
}
