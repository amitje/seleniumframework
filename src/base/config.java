package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import utils.wfunction;

public class config  extends wfunction {
	
	
	@BeforeTest

	public void initDrivers(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nak_a\\jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	}
		

		

}
