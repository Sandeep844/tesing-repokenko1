package orange;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginOrange 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91701\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	
		//user is present in login page
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		//maximize the window
		driver.manage().window().maximize();
		}
}