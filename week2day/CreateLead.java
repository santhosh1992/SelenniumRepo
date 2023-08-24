package week2day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[]args) throws InterruptedException {
		
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
        
        WebElement sou = driver.findElement(By.id("createLeadForm_dataSourceId"));
	     Select source=new Select(sou);
	     source.selectByVisibleText("Employee");
	     
	     //select marketing campaign id
	     WebElement mark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	     Select camp=new Select(mark);
	     camp.selectByValue("9001");
	     
	     //select ownership
	     WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	     Select owner=new Select(own);
	     owner.selectByIndex(5);
	     
	     //select countryfield
	     WebElement count = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	     Select field=new Select(count);
	     field.selectByVisibleText("India");
	     
	     //click on create lead button
	     driver.findElement(By.name("submitButton")).click();
	     
	     //get the title of the window
	     String title=driver.getTitle();
	     System.out.println("Title of the Window: " +title);
	     
	     
	     
	     Thread.sleep(1000);
	     driver.close();
	     
        
		
	}

}
