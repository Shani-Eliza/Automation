package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sentiment 
{
	WebDriver driver;
	String url = "https://www.sentiment-reviews.com";
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/header/nav/div/a/img")).click(); //Logo selection
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//String page = driver.getPageSource();
		String element = "www.sentiment-reviews.com";
		js.executeScript("arguments[0].scrollIntoView();", element);
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"stores-landing\"]/div/div/div[4]/div/a"));
//		js.executeScript("arguments[0].scrollIntoView();", element);
		
		driver.findElement(By.xpath("//*[@id=\"stores-landing\"]/div/div/div[2]/div/div/ul/li[1]/a")).click(); //Google
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"stores-landing\"]/div/div/div[2]/div/div/ul/li[2]/a")).click(); //Open table
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"stores-landing\"]/div/div/div[2]/div/div/ul/li[3]/a")).click(); //Trip advisor
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"stores-landing\"]/div/div/div[3]/div/a[1]/img")).click(); //Facebook
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"stores-landing\"]/div/div/div[3]/div/a[2]/img")).click(); //Instagram
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"stores-landing\"]/div/div/div[4]/div/a")).click(); //Home link
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(3000);
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).click(); //About Us
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click(); //How it works
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click(); //Why you need this
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/a[1]")).click(); //Login
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/a[2]")).click(); //Get started
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click(); //Contact Us
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
