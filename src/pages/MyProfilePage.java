package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyProfilePage extends PageObject {
	
//	5_MyProfilePage
//	Idi na Site Admin opciju, idi na profile i upisi ime i prezime i update-uj profile
//	Izloguj se(gornji desni ugao, hover na username)
	public MyProfilePage(WebDriver driver) {
		super(driver);
	}
	
	// ***************elementi
//	Admin opcija
	@FindBy(className = "display-name")
	WebElement adminAccount;
//	First Name
	@FindBy(id = "first_name")
	WebElement firstName;
//	Last Name
	@FindBy(id = "last_name")
	WebElement lastName;
	
//	Update Profile
	@FindBy(id = "submit")
	WebElement submitBtn;
	
//	Log Out
//	@FindBy(id= "wp-admin-bar-logout")
	@FindBy(css = "#wp-admin-bar-logout > a")

	WebElement logOut;	

//	hasPopUp
	@FindBy(xpath = "html/body/div[1]/div[2]/div[1]/div/ul[2]/li/a")
	WebElement hasPopUp;
	
//metoda koja definise sta se radi nad elementima
public void submitAccount() {
	adminAccount.click();
}

//metoda koja definise sta se radi nad elementima
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


	// ****verifikacija

//verifikacija da smo se ulogovali na MyProfilePage
public boolean ishasPopUpMessage() {
	wait.until(ExpectedConditions.visibilityOf(hasPopUp));
	return hasPopUp.isDisplayed();
}		


	// verifikacija da je promenjen url tj. da smo se izlogovali
		public boolean logOutMess() {
			String expectedurl = "http://store.demoqa.com/wp-login.php?loggedout=true";
			String actualUrl = "http://store.demoqa.com/wp-login.php?loggedout=true";
			if (actualUrl.equals(expectedurl)) {			
		}
			return true;		
	}
		

		

}

