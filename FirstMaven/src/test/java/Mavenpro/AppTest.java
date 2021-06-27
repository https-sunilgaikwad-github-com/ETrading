package Mavenpro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	@Test
	public void launchchrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\SelJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://upstox.com/");
		
	
	}
	
	@Test
	public void printtrue() {
		assertTrue(true);
		System.out.println("Successful");
			
	}

}
