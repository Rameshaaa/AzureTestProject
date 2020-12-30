package Azure.Devops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AzureTest {

	@Test
	public void azuretest() {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\561877\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/CustomerRegistration/");
		System.out.println("URL launched");
		System.out.println("URL is launched");
		System.out.println("URL of CR launched");
	}

}
