package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//setup the path
        ChromeDriver driver =new ChromeDriver();
        //Load the url
        driver.get("http://leaftaps.com/opentaps/control/login");
        //maximize the window
        driver.manage().window().maximize();
        //findElement Enter username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        Thread.sleep(2000);
        //findElement Enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //findElement click login
        driver.findElement(By.className("decorativeSubmit")).click();
        //verify the page is open
        //To get the title of the page
        Thread.sleep(2000);
        String title = driver.getTitle();     //assign local variable ctrl+2
        System.out.println(title);

	}

}
