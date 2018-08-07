package tests;

import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Browser {
	static WebDriver driver;

	// definise Before uslove koji ce se izvrsavati PRE svih klasa (BeforeClass)
	@BeforeSuite
	public void setUp() {
		// Definisemo objekat driver za rad sa ChromeDriver
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();

		// Definisemo objekat za implicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// definise Before uslove
	@AfterSuite
	public void tearDown() {
		driver.close();

	}

}
