package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductPage extends PageObject {
//	2_ProductPage
//	Idi na Product Category i izaberi dve kategorije i po jedan artikal iz svake kategorije ubaci u korpu 
//	(observe-uj da je dobar broj u kopri)
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	 
	// ***************elementi
//	product category
//	@FindBy(xpath = "html/body/div[2]/div/div/header/nav/ul/li[2]/a")
//	WebElement productCategory;

//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"menu-item-33\"]/a")));
//	WebElement productCategory = driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"));
//	
//	Actions builder = new Actions(driver);
//	builder.moveToElement(product).build().perform();
//	
//	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li#menu-item-36 > a")));
//	WebElement iPads = driver.findElement(By.cssSelector("li#menu-item-36 > a"));
//	iPads.click();
//	
	
    Actions builder = new Actions(driver);
    WebElement productCategory = driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"));
//    WebElement iPads = driver.findElement(By.cssSelector("#menu-item-36 > a")).click();
//    Action hover = builder.moveToElement(productCategory)
    		  Action hover = builder.moveToElement(productCategory).click()
    		.build();
    		
//*************************
//    			WebDriverWait wait = new WebDriverWait(driver, 10);
//    			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")));
//    			WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
//    			//4. tacka
//    			Actions builder = new Actions(driver);
//    			
//    			builder.moveToElement(women).build().perform();
//    			//5 tacka
//    			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")));
//    			WebElement tShirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
//    			tShirts.click();

	
//******************	
////	klik na iPads
	@FindBy(css = "#menu-item-36>a")               
	WebElement iPads;

    
//	klik na 1 artikal za korpu
//	@FindBy(css = "html/body/div[2]/div/div/div/div/div[1]/article/div/div/div[4]/div[2]/form/div[2]/div[1]/span/input")
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div[1]/article/div/div/div[4]/div[2]/form/div[2]/div[1]/span/input")               
	WebElement addToCart1;	
	
//	iMacs
	@FindBy(css = "#menu-item-35>a")
	WebElement iMacs;	
	
//	klik na 2 artikal za korpu
	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div[1]/article/div/div/div[3]/div[2]/form/div[2]/div[1]/span/input")
	WebElement addToCart2;	
//	klik na Checkout
	@FindBy(xpath = "html/body/div[2]/div/div/header/div[1]/a")               
	WebElement Checkout;
	
//	metoda koja definise sta se radi nad elementima
	public void submit() {
		productCategory.click();
		iPads.click();
		addToCart1.click();
		iMacs.click();
		addToCart2.click();
		Checkout.click();
	}
	
//	public static ProductPage getLocatorClass(WebDriver driver)	{
//		return PageFactory.initElements(driver, ProductPage.class);
//	}
	
	// ****verifikacija
	
//verifikacija za ProductPage je u CheckOutPageTest


}
