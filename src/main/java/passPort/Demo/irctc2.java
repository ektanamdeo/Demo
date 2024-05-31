package passPort.Demo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class irctc2 {
public static void main(String[] args) throws InterruptedException, IOException {
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = null;
//	driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
//	WebElement image = driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/y1/r/4lCu2zih0ca.svg']"));
//	//1st
//	Boolean state = image.isDisplayed();
//	System.out.println(state);//or
//	if (state == true) {
//		System.out.println("logo is available");
//		} else {
//		System.out.println("logo is not available");
//		}
//	//2nd 
//	org.openqa.selenium.Dimension s = image.getSize();
//	int h= s.getHeight();
//	int w= s.getWidth();
//	System.out.println(h);
//	System.out.println(w);
//	//
//	org.openqa.selenium.Point p = image.getLocation();
//	int x = p.getX();
//	int y = p.getY();
//	System.out.println(x);
//	System.out.println(y);
//	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//	System.out.println(allLinks);
//	int nooflinks = allLinks.size();
//
//    int noOfLinks = allLinks.size();
//    System.out.println("Total number of links: " + noOfLinks);

//    for (WebElement element : allLinks) {
//        String url = element.getAttribute("href");
//
//        try {
//            URL link = new URL(url);
//            HttpURLConnection con = (HttpURLConnection) link.openConnection();//just prepared connerction with url
//
////            con.setRequestMethod("HEAD"); // Use HEAD request for faster response
//
//            int code = con.getResponseCode();
//
//            if (code >= 400) {
//                System.out.println(url + " - Link is broken (HTTP response code: " + code + ", Message: " + con.getResponseMessage() + ")");
//            } else {
//                System.out.println(url + " - Link is not broken");
//            }
//
//            con.disconnect(); // Close the connection
//        } catch (Exception e) {
//            System.out.println(url + " - Exception: " + e.getMessage());
//        }
//    }
//
//    driver.quit();
    Properties prop = new Properties();//first create the object of property class
    FileInputStream ip =new  FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Demo\\src\\main\\java\\passPort\\Demo\\pro.properties");
   prop.load(ip);//this is making the connection b/w the java code and properties
   System.out.println(prop.getProperty("browser"));
   String browsername = prop.getProperty("browser");
   if(browsername.equals("chrome"))
   {
	 driver = new ChromeDriver();
   }
   else if (browsername.equals("firefox"))
   {
	   driver = new FirefoxDriver();
   }else {
		   System.out.println(" no browser ");
	   
   }
   driver.get(prop.getProperty("url"));
   driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));
   driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   
}
    

	
}

