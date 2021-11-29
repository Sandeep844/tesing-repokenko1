package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import aboutus.testing1;

public class GetYourScore 
{  
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91701\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	//user is present in login page
	driver.get("https://kenkohealth.in");
	//maximize the window
	driver.manage().window().maximize();
	//user clicks on i am already a member button
		driver.findElement(By.xpath("//span[contains(text(),'Already a Member?')]")).click();
		Thread.sleep(2000);
	
		//user enters the email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chandanagraj143@gmail.com");
		//user enters the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		//clicks on login page
		
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		
		//click on get u r score
		driver.findElement(By.xpath("//a[@href=\"/kenko-score\"]")).click();
		
		//click on check box terms and conditions
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//click on start button
		driver.findElement(By.xpath("//span[text()=\"Let's start\"]")).click();
		
		//select your self and click on next question ..Are you taking this score for yourself or for your family?
		driver.findElement(By.xpath("//button[@type='submit']//span[text()=\"Yourself\"]")).click();
		driver.findElement(By.xpath("//button[@type='button']//span[text()=\"Next Question\"]")).click();
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		//In which city will you require hospital, medicine and other healthcare services?
		String BANGALURU="BANGALURU" ,H="HYDERABAD",D="DELHI",M="MUMBIA",NM="NAVIMUMBIA",C="CHENNAI",O="OTHER"; 
	    //Select one plan here
	    switch(BANGALURU)
	    {  
	    //Case statements  
	    case "BANGALURU":driver.findElement(By.xpath("(//button/*[text()=\"Bengaluru\"])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[2]")).click();
	    System.out.println("SELECTED BANGULURU CITY");  
	    break;  
	    
	    
	    case "HYDERABAD":driver.findElement(By.xpath("(//button/*[text()=\"Hyderabad\"])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[2]")).click();
	    System.out.println("SELECTED HYDERABAD CITY");  
	    break;  
	    
	    
	    case "DELHI":driver.findElement(By.xpath("(//button/*[text()=\"Delhi NCR\"])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[2]")).click();
	    System.out.println("SELECTED DELHI CITY");  
	    break;  
	    
	    
	    case "MUMBIA":driver.findElement(By.xpath("(//button/*[text()=\"Mumbai\"])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[2]")).click();
	    System.out.println("SELECTED MUMBIA CITY");  
	    break;  
	    
	    
	      case "NAVIMUMBIA":driver.findElement(By.xpath("(//button/*[text()=\"Navi Mumbai\"])[1]")).click();  
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[2]")).click();
	      System.out.println("SELECTED NAVI MUMBIA CITY");  
	      break;  
	    
	    
	    case "CHENNAI": driver.findElement(By.xpath("(//button/*[text()=\"Chennai\"])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[2]")).click();
	    System.out.println("SELECTED CHENNAI");  
	    break;  
	    
	         case "OTHER": driver.findElement(By.xpath("(//button/*[text()=\"Other\"])[1]")).sendKeys("MHARASTRA");
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[2]")).click();
	    	 System.out.println("SELECTED OTHER CITIY");  
	         break;  
	    
	    //Default case statement  
	    default:System.out.println("PLEASE SELECT ANYONE OF THE CITIES");  
	    }  		
	//------------------------------------------------------------------------------------------------------	
	   // What is your residence pincode?
		//enter residence pin code and click on next question
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div/input[@id='quizInput#3'])[1]")).sendKeys("500050");
	    driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[3]")).click();    
	//-------------------------------------------------------------------------------------------------------
	    //What is your date of birth?
	//date of birth
	    Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[2]")).click();
	 Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[text()=\"OK\"])")).click();
driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[4]")).click();	
	//--------------------------------------------------------------------------------------------------------------
//What is your gender?
	//select gender
	Thread.sleep(2000);
     driver.findElement(By.xpath("(//button/*[text()=\"Male\"])[1]")).click();
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[5]")).click();     
     //----------------------------------------------------------------------------------------------------------
     //What is your height in Feet?
     //hight in feet
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//div/input[@id='quizInput#undefined'])[2]")).sendKeys("5");
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[7]")).click();	
     //-----------------------------------------------------------------------------------------------------------
     //What is your height in inches?
     //hight in inches
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//div/input[@id='quizInput#undefined'])[3]")).sendKeys("5");
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[8]")).click();   
     //------------------------------------------------------------------------------------
    // What is your weight in Kgs?
     //(//div/input[@id='quizInput#undefined'])[4]
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//div/input[@id='quizInput#undefined'])[4]")).sendKeys("56");
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[9]")).click();   
    		 //------------------------------------------------------------------------
     Thread.sleep(2000);
     //Do you smoke or use any other tobacco or vaping products like Juul etc?
     driver.findElement(By.xpath("(//span[text()=\"No\"])[1]")).click();
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[13]")).click();     
     //-----------------------------------------------------------------------------------------
     //Are you married?
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//button/*[text()=\"Yes\"])[2]")).click();
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[14]")).click();     
     //-----------------------------------------------------------------------------------------
     //Do you have children?
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[text()=\"Yes\"])[3]")).click();
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[15]")).click();    
     //-----------------------------------------------------------------------------------------
     //Have you ever been diagnosed with
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[text()=\"None of the above\"])[1]")).click();    
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[16]")).click();
     //-----------------------------------------------------------------------------------------
     //Have you ever had any bone or joints-related disorders?
     Thread.sleep(2000);    
     driver.findElement(By.xpath("(//span[text()=\"No\"])[4]")).click();     
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[16]")).click();
     //-----------------------------------------------------------------------------------------
     //Have you ever had any breathing-related disorders?
     Thread.sleep(2000);
     driver.findElement(By.xpath(" (//span[text()=\"No\"])[5]")).click();     
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[17]")).click();
     //-----------------------------------------------------------------------------------------  
     //Have you ever been detected with Stomach, liver, pancreas, intestine, gall bladder related disorders?
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[text()=\"No\"])[6]")).click();   
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[18]")).click();
     //-----------------------------------------------------------------------------------------
   //  Have you ever been detected with Cancer, Tumor or any long lasting diseases or Kidney or Urinary tract-related disorders including stones?
     Thread.sleep(2000);    
     driver.findElement(By.xpath("(//span[text()=\"No\"])[7]")).click();     
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[19]")).click();
     //-----------------------------------------------------------------------------------------   
     //Have you had any surgeries in the past 1 year?
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[text()=\"No\"])[8]")).click();     
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[20]")).click();
     //-----------------------------------------------------------------------------------------
     //Are you required to or been advised to have any surgeries in the next 1 year?
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[text()=\"No\"])[9] ")).click();    
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[21]")).click();
     //-----------------------------------------------------------------------------------------     
     //Have you ever been detected with any mental health disorders?
     Thread.sleep(2000);
     driver.findElement(By.xpath(" (//span[text()=\"No\"])[10]")).click();     
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[22]")).click();
     //-----------------------------------------------------------------------------------------
     //Do you have reason to believe that in next 12 months you may need to take treatment for the following    
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[text()=\"None of the above\"])[1]")).click();     
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[23]")).click();
     //-----------------------------------------------------------------------------------------    
     //Do you have reason to believe that in next 24 months you may need to take treatment for following
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[text()=\"None of the above\"])[2]")).click();
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[24]")).click();
     //-----------------------------------------------------------------------------------------
      //Diagnostic tests expenditure in the last one year (answer in Rs)
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@id=\"quizInput#undefined\"])[9] ")).sendKeys("20000");
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[26]")).click();
     //-----------------------------------------------------------------------------------------
     //Doctor consultations expenditure in the last one year (answer in Rs)
     Thread.sleep(2000);
     driver.findElement(By.xpath(" (//input[@id=\"quizInput#undefined\"])[10]")).sendKeys("50000");
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[27]")).click();
     //-----------------------------------------------------------------------------------------
     //Medicines expenditure in the last one year (answer in Rs)
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@id=\"quizInput#undefined\"])[11]")).sendKeys("11000");
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[28]")).click();
     //-----------------------------------------------------------------------------------------
     //What is your monthly household income?
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@id=\"quizInput#22\"])[1]")).sendKeys("100000");
     driver.findElement(By.xpath("(//button/*[text()=\"Next Question\"])[32]")).click();
     
     //-----------------------------------------------------------------------------------------
     //Terms & Conditions
     
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).sendKeys("100000");
     //submiting the quiz
    // driver.findElement(By.xpath("//span[text()=\"Submit Quiz\"][3]")).click();
     //-----------------------------------------------------------------------------------------
     System.out.println("quiz is completed successfully");
   
	driver.quit();
	testing1 ts=new testing1();
			ts.hii();
		
		
		
}
}
