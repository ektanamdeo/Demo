package passPort.Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FirstProject {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.passportindia.gov.in/AppOnlineProject/welcomeLink");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='twoyears-close-btn']")).click();
		driver.findElement(By.xpath("//div[@class='main_button_typ_002']")).click();////div[contains(text(), ' Registration')]
		driver.findElement(By.xpath("//*[text() = 'Passport Office']")).click();
		 WebElement staticdropdown= driver.findElement(By.xpath("//*[@name='dcdrLocation']"));
		Select dropdown =new Select (staticdropdown);
		dropdown.selectByValue("7");
		driver.findElement(By.xpath("//input[@name='givenName']")).sendKeys("ekta");
	 	driver.findElement(By.xpath("//input[@aria-describedby='surnameDesc']")).sendKeys("namdeo");
		driver.findElement(By.xpath("//input[@class='txtbox hasDatepicker']")).click();
		 WebElement drop=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		 Select dropdown1 =new Select (drop);
	     dropdown1.selectByValue("7");
	     WebElement drop1=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	     Select dropdown2 =new Select (drop1);
	     dropdown2.selectByValue("1999");
	     driver.findElement(By.xpath("//a[text()='25']")).click();
	     driver.findElement(By.xpath("//input[@id='email'] ")).sendKeys("ektanamdeo08@gmail.com");
	     driver.findElement(By.xpath("//input[@id='emailloginSameno'] ")).click();
	     driver.findElement(By.xpath("//input[@id='loginId'] ")).sendKeys("ekta1");
	     driver.findElement(By.xpath("//input[@id='pwd'] ")).sendKeys("ekta123");
	     driver.findElement(By.xpath("//input[@id='confirmPwd'] ")).sendKeys("ekta123");
	      WebElement drop2=driver.findElement(By.xpath("//select[@id='hintQues'] "));
	      Select dropdown3 =new Select (drop2);
		  dropdown3.selectByValue("Mother's Maiden Name");
		  driver.findElement(By.xpath("//input[@id='hintAns'] ")).sendKeys("jabalpur");
		  List<WebElement> links=driver.findElements(By.tagName("a"));
		int  size= links.size();
		System.out.println(size);
		  for(WebElement printLinks:links)
		  {
			  System.out.println(printLinks.getAttribute("href"));
		  }
			  
			  
	     
	     
		
		
		
	
	
	
	
	}////*[text()='X']

}
