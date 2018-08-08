package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends PageObject {

	WebDriverWait wait = new WebDriverWait(driver, 10);

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"menu-item-33\"]/a")
	WebElement productCategory;

	@FindBy(xpath = "//*[@id=\"menu-item-35\"]/a")
	WebElement iMacs;

	@FindBy(css = "input[name='Buy']")
	WebElement add_iMac;

	@FindBy(xpath = "//*[@id=\"default_products_page_container\"]/div[3]/div[2]/form/div[2]/div[1]/div[2]/p")
	WebElement successText;

	@FindBy(css = "#menu-item-37 > a")
	WebElement iPhones;

	@FindBy(xpath = "//*[@id=\"default_products_page_container\"]/div[4]/div[2]/form/div[2]/div[1]/span/input")
	WebElement add_iPhone;

	@FindBy(xpath = "//*[@id=\"default_products_page_container\"]/div[4]/div[2]/form/div[2]/div[1]/div[2]/p")
	WebElement successText2;

	@FindBy(css = "#header_cart > a > em.count")
	WebElement checkItems;

	@FindBy(xpath = "html/body/div[2]/div/div/header/div[1]/a")
	WebElement checkout;

	public void buyiMacs() {
		Actions builder = new Actions(driver);
		Action buyFirstItem = builder.moveToElement(productCategory).build();
		buyFirstItem.perform();

		wait.until(ExpectedConditions.visibilityOf(iMacs));
		iMacs.click();

		wait.until(ExpectedConditions.visibilityOf(add_iMac));
		add_iMac.click();
	}

	public String isTextAt() {
		wait.until(ExpectedConditions.visibilityOf(successText));
		return successText.getText();
	}

	public void buyiPhone() {
		Actions builder = new Actions(driver);
		Action buySecondItem = builder.moveToElement(productCategory).build();
		buySecondItem.perform();

		wait.until(ExpectedConditions.visibilityOf(iPhones));
		iPhones.click();

		wait.until(ExpectedConditions.visibilityOf(add_iPhone));
		add_iPhone.click();

	}

	public String isText2At() {
		wait.until(ExpectedConditions.visibilityOf(successText2));
		return successText2.getText();
	}

	public boolean isCheckItems() {
		wait.until(ExpectedConditions.textToBePresentInElement(checkItems, "2"));
		return checkItems.isDisplayed();
	}

	public void isCheckout() {
		wait.until(ExpectedConditions.visibilityOf(checkout));
		checkout.click();
	}

}
