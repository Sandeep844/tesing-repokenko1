package offlineTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 
{
	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91701\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//user is present in login page
	driver.get("https://kenkohealth.in");
	//maximize the window
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()=\"View our Plans\"]")).click();
	
	
		
	
     String M="miniplan" ,I="individualplan",F="familyplan",D="diabetesplan",S="seniorcitizenplan",T="theultimateplan";
     
	    //Select one plan here
	    switch(I)
	    {  
	    //Case statements  
	    case "familyplan": WebElement element2=driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[2]"));
	    js.executeScript("arguments[0].scrollIntoView();", element2);
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[2]")).click();
	    System.out.println("999 family plan");  
	    break;  
	    
	    
	    case "individualplan":WebElement element1=driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[1]"));
	    js.executeScript("arguments[0].scrollIntoView();", element1);
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[1]")).click();
	    	System.out.println("599 individual plan");  
	    break;  
	    
	    
	    case "miniplan":WebElement element3= driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[3]"));
	    js.executeScript("arguments[0].scrollIntoView();", element3);
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[3]")).click();
	    	System.out.println("299 mini plan");  
	    break;  
	    
	    
	    case "diabetesplan":WebElement element6= driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[6]"));
	    js.executeScript("arguments[0].scrollIntoView();", element6);
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[6]")).click();
	    	System.out.println("999 diabetes plan");  
	    break;  
	    
	    
	    case "seniorcitizenplan":WebElement element5=driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[5]"));
	    js.executeScript("arguments[0].scrollIntoView();", element5);
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[5]")).click();
	    	System.out.println("1499 seniorcitizenplan");  
	    break;  
	    
	    
	    case "theultimateplan": WebElement element4=	driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[4]"));
	     js.executeScript("arguments[0].scrollIntoView();", element4);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//span[text()=\"Subscribe Now\"])[4]")).click();
	    	System.out.println("1999 the ultimate plan");  
	    break;  
	    
	    //Default case statement  
	    default:System.out.println("please select a plan");  
	    }  
	    
	    // click on i am already registered link
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[text()=\"Wait!! I’m already registered.\"])")).click();
	    
	    
	  //user enters the email id
	    driver.findElement(By.xpath("//input[@id='email']")).click();
	  		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user-4@gmail.com");
	  		//user enters the password
	  		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	  		//clicks on login page
	  		
	  		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	    
	   // driver.quit();

}
}

