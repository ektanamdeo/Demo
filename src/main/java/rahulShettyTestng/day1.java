package rahulShettyTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day1 {

	// @Test(retryAnalyzer = analizer.RetryAnalyser.class)
	@Test(enabled = false)
	public void setup() {
		System.out.println("AAAAAA");
		Assert.assertEquals(true, true);
	}

	@Test(priority = 1,groups ="sanity",expectedExceptions = ArithmeticException.class)
	public void personalloan() {
		Assert.assertEquals(true, true);
		System.out.println("BBBBB");
		System.out.println("ekta   " + Thread.currentThread().getId());
		int a=5;
		int b=0;
		int sum =a/b;
		System.out.println(sum);
	}

	@Test(priority = 2,groups="sanity")
	public void setuppppp() {
		System.out.println("cccc");
		Assert.assertEquals(true, true);
//		int i=1;
//		while(i==1)
//		{
//			System.out.println(i);
//		}
	}

}
