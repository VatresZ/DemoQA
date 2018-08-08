package tests;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.HomePage;
import pages.MyProfilePage;
import pages.ProductPage;
import pages.ProfilePage;

public class HomePageTest extends Browser {
	HomePage home;
	ProductPage product;
	CheckOutPage checkout;
	ProfilePage profile;
	MyProfilePage myprofile;

	@Test(priority = 0)
	public void goToHome() {
		driver.get("http://store.demoqa.com/");

		home = new HomePage(driver);
		home.submit();

		assertTrue(home.isMouseMessage());
		assertTrue(home.isPhone5Message());
		assertTrue(home.isPodMessage());
	}
}
