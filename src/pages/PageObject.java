package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
	// Definišemo public web drajver za rad u web okruženju
	public WebDriver driver;	
	// Definišemo Wait
	public WebDriverWait wait;
	
	public PageObject(WebDriver driver) {
			// Definisemo driver ali this.driver jer se radi o drajveru iz Kontruktora a ne iz class PageObject
		this.driver = driver;
		// Definisemo wait
		wait = new WebDriverWait(driver, 10);
			// Inicijalizujemo def. drajver
		PageFactory.initElements(driver, this);
	}
		
		
	}

