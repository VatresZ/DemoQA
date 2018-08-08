package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends PageObject {

	public MyProfilePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "display-name")
	WebElement adminAccount;

	@FindBy(id = "first_name")
	WebElement firstName;

	@FindBy(id = "last_name")
	WebElement lastName;

	@FindBy(id = "submit")
	WebElement submitBtn;

	@FindBy(xpath = "html/body/div[1]/div[2]/div[1]/div/ul[2]/li/a")
	WebElement logOut;

	@FindBy(xpath = "html/body/div[1]/div[2]/div[1]/div/ul[2]/li/a")
	WebElement toLogOut;

	public void submitAccount() {
		adminAccount.click();
	}

	public void fillInData(String firstName, String lastName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}

	public void submitUpdate() {
		submitBtn.click();
	}

	public void submitLogOut() {
		logOut.click();
	}

	public void toLogOut() {
		toLogOut.click();
	}

	public boolean logOutMess() {
		String expectedurl = "http://store.demoqa.com/wp-login.php?loggedout=true";
		String actualUrl = "http://store.demoqa.com/wp-login.php?loggedout=true";
		if (actualUrl.equals(expectedurl)) {

			return true;
		}

		return false;
	}

}
