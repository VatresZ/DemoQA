package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HomePage;
import pages.MyProfilePage;
import pages.ProductPage;
import pages.ProfilePage;

public class MyProfilePageTest extends Browser {
	HomePage home;
	ProductPage product;
	CheckOutPage checkout;
	ProfilePage profile;
	MyProfilePage myprofile;

	@Test(priority = 4)
	public void goToMyProfile() {
		myprofile = new MyProfilePage(driver);
		myprofile.submitAccount();
		myprofile.fillInData("Dragan", "Draganic");
		myprofile.submitUpdate();
		myprofile.submitLogOut();
		myprofile.toLogOut();
		assertTrue(myprofile.logOutMess());
	}
}
