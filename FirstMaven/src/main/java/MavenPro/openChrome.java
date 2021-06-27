package MavenPro;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {
	@Test

			public void launchchromeA(){
			System.setProperty("webdriver.chrome.driver", "C:\\SelJar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https:google.com");
		

	}

}
