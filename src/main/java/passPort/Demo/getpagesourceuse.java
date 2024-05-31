package passPort.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesourceuse {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
}
}
