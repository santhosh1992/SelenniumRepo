package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	public static void main(String[] args) {
	
    ChromeDriver driver =new ChromeDriver();
    
    driver .get("http://www.facebook.com/login");
    
    driver.manage().window().maximize();

	}

}
