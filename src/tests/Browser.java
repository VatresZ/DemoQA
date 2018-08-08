package tests;

import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Browser {
	static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		driver.close();

	}

}
