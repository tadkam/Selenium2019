package Introduction.Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\tadek\\2019\\drivery\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	
		
		
		System.out.println(driver.getCurrentUrl()); 
		
		//System.out.println(driver.getPageSource());
		
		
		driver.get("http://yahoo.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.close();
		
		driver.quit(); // close all windows
		
		
		
	}

}
