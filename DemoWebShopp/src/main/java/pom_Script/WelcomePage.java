package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//constructor
	public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
			
		}
	
	@FindBy(linkText="Register")
	private WebElement regLink;
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(linkText="Shopping cart")
	private WebElement ShoppingLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement DigitalDownloadsLink;
	
	
	public WebElement getDigitalDownloadsLink() {
		return DigitalDownloadsLink;
	}


	public void setDigitalDownloadsLink(WebElement digitalDownloadsLink) {
		DigitalDownloadsLink = digitalDownloadsLink;
	}

	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlistLink;
	

	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutLink;


	public WebElement getRegLink() {
		return regLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getShoppingLink() {
		return ShoppingLink;
	}


	public WebElement getWishlistLink() {
		return wishlistLink;
	}


	public WebElement getLogoutLink() {
		return logoutLink;
	}


	
	
	
	
	
}
