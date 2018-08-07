package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetElementText;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageObject {
//	3_CheckOutPage
//	Klikni na checkout, istestiraj Update i Remove dugmad
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	// ***************elementi
//	Checkout
	@FindBy(xpath = "html/body/div[2]/div/div/header/div[1]/a")
	WebElement checkOut;
//	quantity
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/article/div/div[2]/div[1]/table/tbody/tr[2]/td[3]/form/input[1]")
	WebElement quantity;
// Update
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/article/div/div[2]/div[1]/table/tbody/tr[2]/td[3]/form/input[4]")
	WebElement upDate;	
//	Remove
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/article/div/div[2]/div[1]/table/tbody/tr[2]/td[6]/form/input[4]")
	WebElement remove;	
	
//	verifikacija pricedisplay text za ProductPage
	@FindBy(className = "pricedisplay")
	WebElement pricedisplayMessage;
	
//	metoda koja definise sta se radi nad elementima
	public void submitCheck() {
		checkOut.click();
	}

	public void fillInData(String quantity) {
		this.quantity.sendKeys(quantity);
	}

	public void submitUpdate() {
		upDate.click();

	}

	public void submitRemove() {
		remove.click();
	}

	
	// ****verifikacija
//	verifikacija za ProductPage da je iznos odabrane robe veci od nule
	public boolean ispricedisplayMessage() {
		String emptyTotal = "$0.00";
		wait.until(ExpectedConditions.visibilityOf(pricedisplayMessage));
		if (pricedisplayMessage.equals(emptyTotal)) {
		System.out.print("Sub Total is empty! ");
		}
		return pricedisplayMessage.isDisplayed();	
	}
	
//verifikacija da se povecao broj sa Update

	
//verifikacija da se smanjio broj zbog brisanja
	
	


}
