package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserProfiling {
	
	public static void main(String[] args) {
		//disable push notifications in chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		//1)open the browser
		ChromeDriver driver = new ChromeDriver(options);
		
		//2)maximize it
		driver.manage().window().maximize();
		
		//3)navigate to application
		driver.get("https://yatra.com");

}
}