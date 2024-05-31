package passPort.Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SpiceJet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Amritsar']")).click();
		//Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']")).click();
	    driver.findElement(By.xpath("//div[text()='Bhopal']")).click();
	    Thread.sleep(2000);
	    while(!(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText().contains("August2024")));
	    {
	    	driver.findElement(By.xpath("//div[@class='r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']")).click();
	    }
	   driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
	
	}

}
