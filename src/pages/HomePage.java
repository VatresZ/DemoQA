package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/ul/a[1]")
	WebElement span1;

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/ul/a[2]")
	WebElement span2;

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/ul/a[3]")
	WebElement span3;

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/div/div[1]/div[1]/h2")
	WebElement magicMouseMessage;

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/div/div[1]/div[1]/h2")
	WebElement iPhone5Message;

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/div/div[1]/div[1]/h2")
	WebElement iPodMessage;

	public void submit() {
		span1.click();
		span2.click();
		span3.click();
	}

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