package tests;

import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HomePage;
import pages.MyProfilePage;
import pages.ProductPage;
import pages.ProfilePage;

public class CheckOutPageTest extends Browser {
	HomePage home;
	ProductPage product;
	CheckOutPage checkout;
	ProfilePage profile;
	MyProfilePage myprofile;

	@Test(priority = 2)
	public void goToCheckBox() {
		checkout = new CheckOutPage(driver);
		checkout.fillInData("3");
		checkout.submitUpdate();
		checkout.submitRemove();
		checkout.ispricedisplayMessage();

	}
}
