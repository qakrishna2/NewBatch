package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReusableMethods {

	static WebDriver driver;
	static WebElement ele;


	public static WebDriver initBrowser(String browserName) {

		switch (browserName.toLowerCase()) {

		case "ie":
			System.setProperty("webdriver.ie.driver", "");
			driver = new InternetExplorerDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "Z:\\\\Selenium Softwares\\\\chromedriver.exe");
			ChromeOptions cp = new ChromeOptions();
			cp.addArguments("start-maximized");
			driver = new ChromeDriver(cp);
			break;
		case "firefox":
			System.setProperty("webdriver.gekho.driver", "Z:\\\\Selenium Softwares\\\\chromedriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}

	
	public static void takeScreenShot() throws IOException
	{
		TakesScreenshot ts = ((TakesScreenshot) driver);

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("C:\\Users\\Varsha\\Desktop\\screenshot"
				+ new SimpleDateFormat("dd-MM-yy-hh-mm-ss").format(new Date()) + ".jpeg"));
	}
	
	
	public static void clickWebElement(String locatorType, String locator)
	{
	
		if(locatorType.equalsIgnoreCase("xpath"))
		{
			ele = driver.findElement(By.xpath(locator));
		}
		ele.click();
	}
}
