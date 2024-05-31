package rahulShettyTestng;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksFind {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://ahrefs.com/broken-link-checker");
		List<WebElement>  links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		List<String> urllist =new ArrayList<String>();
		for(WebElement e:links)
		{
			String url = e.getAttribute("href");
			urllist.add(url);
			checkBrokenLink(url);
		}
		
	}
	public static  void checkBrokenLink(String linkurl)
	{
		try 
		{
			URL url= new URL(linkurl);
		HttpURLConnection httpsurlconection=  (HttpURLConnection) url.openConnection();
		httpsurlconection.setConnectTimeout(5000);
		if(httpsurlconection.getResponseCode()>=400)
		{
			System.out.println("broken ");
			System.out.println(httpsurlconection.getResponseMessage());
		}
		else
		{
		System.out.println("not broken");	
		}
		}
		catch(Exception e)
		{
			
		}
}
}