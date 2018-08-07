package tests;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.support.ui.ExpectedConditions;
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
		
	assertTrue(myprofile.ishasPopUpMessage());
			
		myprofile.fillInData("Zoran", "Vatres");
		
		myprofile.submitUpdate();
		
	
		
		myprofile.submitLogOut();
		
		assertTrue(myprofile.logOutMess());
		
		
  }
}
