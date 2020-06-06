package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class suite implements Autocon {

	public WebDriver driver;
	
	@BeforeSuite
	public void start(){
		System.setProperty(chrome_key, chrome_value);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true" );
		driver=new ChromeDriver();
		driver.get(url);
	}

	/*@AfterSuite
	public void close(){
		driver.quit();
	}*/
}
