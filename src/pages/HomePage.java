package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject {
//	1_HomePage
//	Idi na http://store.demoqa.com/ page
//	Na Home page-u klikni na kruzice i proveri da li je prikaz artikla dobar

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// ***************elementi
//	prvi kruzic
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/ul/a[1]")
	WebElement span1;	
//	drugi kruzic
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/ul/a[2]")
	WebElement span2;
//	treci kruzic
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/ul/a[3]")
	WebElement span3;
//	verifikacija text Magic Mouse za kruzic 1
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/div/div[1]/div[1]/h2")
	WebElement magicMouseMessage;
	
//	verifikacija text iPhone 5 za kruzic 2
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/div/div[1]/div[1]/h2")
	WebElement iPhone5Message;
	
//	verifikacija text iPod Nano Blue za kruzic 3
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/div/div[1]/div[1]/h2")
	WebElement iPodMessage;
	
//	metoda koja definise sta se radi nad elementima
	public void submit() {
	span1.click();
	span2.click();
	span3.click();
	}

	
	// *************************verifikacija
	
	public boolean isMouseMessage() {
		wait.until(ExpectedConditions.visibilityOf(magicMouseMessage));
		return magicMouseMessage.isDisplayed();
	}
	
	public boolean isPhone5Message() {
		wait.until(ExpectedConditions.visibilityOf(iPhone5Message));
		return iPhone5Message.isDisplayed();
	}
	
	public boolean isPodMessage() {
		wait.until(ExpectedConditions.visibilityOf(iPodMessage));
		return iPodMessage.isDisplayed();
	}
	
}