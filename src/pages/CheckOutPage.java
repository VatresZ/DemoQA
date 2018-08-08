package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckOutPage extends PageObject {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/article/div/div[2]/div[1]/table/tbody/tr[2]/td[3]/form/input[1]")
	WebElement quantity;
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/article/div/div[2]/div[1]/table/tbody/tr[2]/td[3]/form/input[4]")
	WebElement upDate;
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/article/div/div[2]/div[1]/table/tbody/tr[2]/td[6]/form/input[4]")
	WebElement remove;
	@FindBy(className = "pricedisplay")
	WebElement pricedisplayMessage;

	public void fillInData(String quantity) {
		this.quantity.clear();
		this.quantity.sendKeys(quantity);
	}

	public void submitUpdate() {
		upDate.click();

	}

	public void submitRemove() {
		remove.click();
	}

	public boolean ispricedisplayMessage() {
		String emptyTotal = "$0.00";
		wait.until(ExpectedConditions.visibilityOf(pricedisplayMessage));
		if (pricedisplayMessage.equals(emptyTotal)) {
			System.out.print("Sub Total is empty! ");
		}
		return pricedisplayMessage.isDisplayed();
	}

}
