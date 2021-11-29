package homePage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginOnKenkoHealth
{    WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91701\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//user is present in login page
	driver.get("https://kenkohealth.in");
	
	
	//maximize the window
	driver.manage().window().maximize();
	
	
//user clicks on i am already a member button
	driver.findElement(By.xpath("//span[contains(text(),'Already a Member?')]")).click();
	
	//user clicks on empty area
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='jss190']")).click();
	
	
	//user enters the email id
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user-4@gmail.com");
	
	
	//user enters the password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	
	
	//clicks on login page
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	
	//click on kenkko top corner left button
	driver.findElement(By.xpath("//div[@style='padding-top: 14px;']")).click();
	
	//
	//click on view our plans
	driver.findElement(By.xpath("//span[text()=\"View our Plans\"]")).click();
	
	
	
	//click on diabites plan 
		WebElement element=	driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[6]"));
	     js.executeScript("arguments[0].scrollIntoView();", element);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[6]")).click();
	   
	     
	   //get kenko score
	     Thread.sleep(2000);
	     String score=driver.findElement(By.xpath("//div[@class='MuiGrid-root jss596 MuiGrid-item MuiGrid-grid-xs-12']/p")).getText();
	     
	     System.out.println("We've already received your Kenko Score:"+score);
	    // driver.switchTo( ).alert( ).dismiss();
	     
	     
	     
	     //
	   
	     driver.findElement(By.xpath("//button/span[@class='MuiButton-label']")).click();
	     driver.close();
	}

}
