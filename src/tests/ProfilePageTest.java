package tests;

import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.HomePage;
import pages.MyProfilePage;
import pages.ProductPage;
import pages.ProfilePage;

public class ProfilePageTest extends Browser {
	HomePage home;
	ProductPage product;
	CheckOutPage checkout;
	ProfilePage profile;
	MyProfilePage myprofile;

	@Test(priority = 3)
	public void goToProfile() {
		profile = new ProfilePage(driver);
		profile.submit();
		profile.fillInData("test@gmail.com", "ee9ECW4#YG");
		profile.submitBtn();
	}
}
