package tests;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
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
		
		assertTrue(checkout.ispricedisplayMessage());
		checkout = new CheckOutPage(driver);
		checkout.submitCheck();

		checkout.fillInData("3");

		checkout.submitUpdate();

		checkout.submitRemove();

//		  assertEquals(checkout.getSuccessMessage(), "Your profile was successfully updated.");  assertTrue(home.isPodMessage());
		
		
		
	}
}
