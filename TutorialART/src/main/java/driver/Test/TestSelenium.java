package driver.Test;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {
	


	

		@Test
		public void start() {
			System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
			File file;
			FileInputStream fis;
			
			//XSSFWorkbook wb;
//			XSSFSheet sheet;
//			XSSFRow row;
//			XSSFCell cell;
			
		}

		
	
	
	
	

//	WebDriver driver = new ChromeDriver();
//	WebDriverWait wdwait = new WebDriverWait(driver, 25);
//	driver.manage().window().maximize();
//	driver.navigate().to("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	

}
