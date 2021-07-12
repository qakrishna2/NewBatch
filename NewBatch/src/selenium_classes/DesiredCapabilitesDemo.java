package selenium_classes;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilitesDemo {
	
	public static void main(String[] args) {
		
		
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
		dc.setCapability(InternetExplorerDriver., value);*/
		
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("start-maximized");
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "Z:\\Selenium Softwares");

		cp.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "Z:\\\\Selenium Softwares\\\\chromedriver.exe");
		WebDriver driver = driver = new ChromeDriver(cp);
		
		driver.get("https://filesamples.com/formats/txt");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//strong[text()='sample3.txt']//following::a[1]")).click();
	}

}
