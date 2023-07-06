package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class verify_error
{	
	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver ();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password@123");
		driver.findElement(By.name("login")).click();
		
		String expectedErrMsg="The email address you entered isn't connected to an account. Find your account and log in.";
		//String actualErrorMsg=driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		String actualErrMsg=driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
		System.out.println(expectedErrMsg);
		System.out.println(actualErrMsg);
		
		if(expectedErrMsg.equals(actualErrMsg))
		{
		System.out.println("testcase passed"); 
		}
		else {
			System.out.println("testcase failed");
		}
		driver.quit();	
		}
		}
	
	
