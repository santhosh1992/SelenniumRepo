package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();    
        driver.get("http://leaftaps.com/opentaps/control/login");       
        driver.manage().window().maximize();   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
       //enter the username
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        
        //enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        //click on loginbutton
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //click on CRM/SFA
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     
	    //click on leads
	     driver.findElement(By.linkText("Leads")).click();
	     
	     //click find leads
	     driver.findElement(By.linkText("Find Leads")).click();
	     
	     //click on first resulting lead
	     driver.findElement(By.linkText("10052")).click();
	     
	     //get the title of window
	     String title=driver.getTitle();
	     System.out.println("Title of the window:"+title);
	     
	     //click on edit 
	     driver.findElement(By.linkText("Edit")).click();
	     
	     
	     //change the company name
	     driver.findElement(By.id("updateLeadForm_companyName")).clear();
	     driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test Leaf");
	     
	     //click update button
	     driver.findElement(By.xpath("//input[@value='Update']")).click();
	     
	     
	     
	     Thread.sleep(1000);
	     driver.close();
	     

	}

}
