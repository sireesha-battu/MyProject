package main.java.com.assignment;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 	System.setProperty("webdriver.chrome.driver", "\\usr\\bin\\chromedriver");
	 	WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.close();
		
	}
}
