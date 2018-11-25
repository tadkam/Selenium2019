package Introduction.Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:\\tadek\\2019\\drivery\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\tadek\\2019\\drivery\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		/*String ada ="ada";
		String bera="bera";
		String c = ada +bera;
		System.out.println(c);*/
	}
}
