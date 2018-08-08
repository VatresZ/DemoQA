package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
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
		product = new ProductPage(driver);
		product.buyiMacs();
		product.isTextAt();
		product.buyiPhone();
		product.isText2At();
		Assert.assertTrue(product.isCheckItems());
		product.isCheckout();
	}
}
