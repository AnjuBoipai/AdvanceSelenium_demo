package pom_Script;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {

	@FindBy(id="termsofservice")
	private WebElement checkbox;
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	

}
