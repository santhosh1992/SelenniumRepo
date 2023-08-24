package week2day2;

import  java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();    
        driver.get("https://en-gb.facebook.com/");       
        driver.manage().window().maximize();   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        //click on create account button
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        
        //enter firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pradhanya");
        
        //enter surname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lakshmi");
        
        //enter mobile number
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543321");
        
        //enter password
        driver.findElement(By.id("password_step_input")).sendKeys("face123");
        
        //Dropdowns
        //day
        WebElement day = driver.findElement(By.id("day"));
        Select days=new Select(day);
        days.selectByVisibleText("23");
        
        //month
        WebElement month = driver.findElement(By.id("month"));
        Select mth=new Select(month);
        mth.selectByValue("2");
        
        //year
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select yr=new Select(year);
        yr.selectByIndex(29);
        
        //Radiobuttons
        driver.findElement(By.xpath("//input[@name='sex']")).click();
        
        
        System.out.println("Title of the Window:" +driver.getTitle());
        Thread.sleep(1000);
        driver.close();
        
	}

}
