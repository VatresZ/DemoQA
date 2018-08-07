package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.CheckOutPage;
import pages.HomePage;
import pages.MyProfilePage;
import pages.ProductPage;
import pages.ProfilePage;

public class ProductPageTest extends Browser {
	HomePage home;
	ProductPage product;
	CheckOutPage checkout;
	ProfilePage profile;
	MyProfilePage myprofile;
 
	@Test(priority = 1)
	public void goToProduct() {
//		driver.get("http://store.demoqa.com/");
		product = new ProductPage(driver);
		product.submit();
	}
	
}
