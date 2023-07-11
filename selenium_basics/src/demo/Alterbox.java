package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alterbox {

	public static void main(String[] args) throws InterruptedException {
		//1)open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2)maximize it
		driver.manage().window().maximize();
		
		//3)navigate to application
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		//4)click on 'CONTINUIE TO LOGIN' button
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		
		//5)click on ' LOGIN' button
		driver.findElement(By.id("Button2")).click();
		
		Thread.sleep(3000);
		
		//6)close the Alert box
		driver.switchTo().alert().accept();
		
}
}