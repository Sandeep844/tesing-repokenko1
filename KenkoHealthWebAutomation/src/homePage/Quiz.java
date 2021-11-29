package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quiz 
{
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91701\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	//user is present in login page
	driver.get("https://stageui.dev-kenko-health.in/kenko-score");
	//maximize the window
	driver.manage().window().maximize();
	//user clicks on i am already a member button
	/*	driver.findElement(By.xpath("//span[contains(text(),'Already a Member?')]")).click();
		Thread.sleep(2000);
	
		//user enters the email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chandanagraj143@gmail.com");
		//user enters the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		//clicks on login page
		
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Thread.sleep(2000);*/
		
		//click on get u r score
		driver.findElement(By.xpath("//a[@href=\"/kenko-score\"]")).click();
		
		//click on check box terms and conditions
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//click on start button
		driver.findElement(By.xpath("//span[text()=\"Let's start\"]")).click();
		
}
	
	
	
	
	
}
