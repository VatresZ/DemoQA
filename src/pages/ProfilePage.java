package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageObject {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "account_icon")
	WebElement myAccount;

	@FindBy(id = "log")
	WebElement userName;

	@FindBy(id = "pwd")
	WebElement pass;

	@FindBy(id = "login")
	WebElement loginBtn;

	public void submit() {
		myAccount.click();
	}

	public void fillInData(String userName, String pass) {
		this.userName.sendKeys(userName);
		this.pass.sendKeys(pass);
	}

	public void submitBtn() {
		loginBtn.click();
	}

}
