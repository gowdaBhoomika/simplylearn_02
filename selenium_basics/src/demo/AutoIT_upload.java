package demo;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoIT_upload {
	public static void main(String[] args) throws InterruptedException {
		//1)open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2)maximize it
		driver.manage().window().maximize();
		
		//3)navigate to application
		driver.get("https://www.remove.bg/");
	
		//4)click 'select files to upload'button
		driver.findElement(By.xpath("//button[contains(@type,'button')])[3]")).click();
		
		Thread.sleep(3000);
		
		//5) Handover the control to AutoIT to select a file from the local machine ,click on 'open'button.
		driver.findElement(By.linkText("Engines and parts")).click();

}
}