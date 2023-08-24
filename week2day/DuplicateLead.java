package week2day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
        //maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //findElement Enter username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        Thread.sleep(2000);
        //findElement Enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //findElement click login
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("leads")).click();
        driver.findElement(By.linkText("create lead")).click();
        driver.findElement(By.id("CreateLeadForm_companyName")).sendKeys("Test leaf");
        driver.findElement(By.id("CreateLeadForm_firstName")).sendKeys("Santhosh");
        driver.findElement(By.id("CreateLeadForm_LastName")).sendKeys("Murthy");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Santhosh");

	     //enter dept field
	     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT");
	     
	     //enter description field
	     driver.findElement(By.name("description")).sendKeys("From July 2023 batch");
	     
	     //enter email
	     driver.findElement(By.name("primaryEmail")).sendKeys("santhoshismurthy@gmail.com");
	     
	     //click on create lead button
	     driver.findElement(By.name("submitButton")).click();
	     
	     //get the title of the window
	     String title=driver.getTitle();
	     System.out.println("Title of the Window: " +title);
	     
	     //click on duplicate button
	     driver.findElement(By.linkText("Duplicate Lead")).click();
	     
	     //Clear the CompanyName Field using .clear() And Enter new CompanyName
	     driver.findElement(By.id("createLeadForm_companyName")).clear();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("hdfc");
	     
	     //Clear the FirstName Field using .clear() And Enter new FirstName
	     driver.findElement(By.id("createLeadForm_firstName")).clear();
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("santhosh");
	     
	     //click on create lead button
	     driver.findElement(By.name("submitButton")).click();
	     
	     //get the title of the window
	     String title1=driver.getTitle();
	     System.out.println("Title of the Window: " +title1);
	     
	     Thread.sleep(1000);
	     driver.close();
        

	}

}
