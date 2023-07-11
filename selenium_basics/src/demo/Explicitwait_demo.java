package demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_demo {

	public static void main(String[] args) {
		//1)open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2)maximize it
		driver.manage().window().maximize();
		
		//3)navigate to application
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
		
		//4)click  on 'start' button
		driver.findElement(By.id("start")).click();
		
		//5)verify the text'Hello world!' appears on the web page
		String expectedText = "Hello world!";
		
		//wait for the text to appear
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
		
		if(actualText.equals(expectedText)) {
			System.out.println("test case fail");
		}
		else {
			System.out.println("test case pass");
		}
		//6)close the browser
		driver.quit();
	}

}
