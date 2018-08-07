package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageObject {
	
//	4_ProfilePage
//	Klikni na My account, uloguj se srecnom putanjom
	
	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
	// ***************elementi
//	Checkout
	@FindBy(className = "account_icon")
	
	WebElement myAccount;
//	Username
	@FindBy(id = "log")
	WebElement userName;
//	Password
	@FindBy(id = "pwd")
	WebElement pass;
//	Login
	@FindBy(id = "login")
	WebElement loginBtn;
		
//	metoda koja definise sta se radi nad elementima
	public void submit() {
		myAccount.click();
	}
//	metoda koja definise sta se radi nad elementima
	public void fillInData(String userName, String pass) {
		this.userName.sendKeys(userName);
		this.pass.sendKeys(pass);
	}
//	metoda koja definise sta se radi nad elementima
	public void submitBtn() {
		loginBtn.click();
	}
	
	// ****verifikacija

	//verifikacija da smo se ulogovali nalazi se na MyProfilePage
	
}
