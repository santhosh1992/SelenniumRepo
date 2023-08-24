package week2day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {

	public static void main(String[] args) {
		
		// setup path and launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("https://login.salesforce.com/");
		// maximize the window
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//enter password
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		//click login
		driver.findElement(By.id("Login")).click();
		//Click AppLauncher
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		String title= driver.getTitle();
		System.out.println(title);
		// TODO Auto-generated method stub

	}

}
