package demo;
import org.openqa.selenium.chrome.ChromeDriver;
public class verify_title {
	
		public static void main(String[] args) {
			//1. open the browser
			ChromeDriver driver =new ChromeDriver ();
			
			//2. navigate to the application
			driver.get("https://www.facebook.com");
			
			String expectedTitle = "Facebook – log in or sign up";
			String actualTitle =driver.getTitle();
			
			System.out.println(expectedTitle);
			System.out.println(actualTitle);
			if(expectedTitle.equals(actualTitle)) {
				System.out.println("test case is passed");
			}
			else {
				System.out.println("test case is failed");
			}
		driver.quit();
		}
		}



