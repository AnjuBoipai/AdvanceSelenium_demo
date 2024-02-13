package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//constructor
		public LoginPage(WebDriver driver){
			PageFactory.initElements(driver,this);
				
			}

		//@FindBy(id="Email")
		@FindAll({@FindBy(id="Email"),@FindBy(name="Email")})
		private WebElement emailTextfield;

		//@FindBy(id="Password")
		@FindAll({@FindBy(id="Password"),@FindBy(name="Password")})
		private WebElement passwordTextField;
		
		//@FindBy(xpath="//input[@value='Log in']")
		@FindAll({@FindBy(xpath="//input[@type='submit']"),@FindBy(xpath="/input[@value='Log in']")})
		private WebElement loginbutton;
		
		
		public WebElement getEmailTextfield() {
			return emailTextfield;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginbutton() {
			return loginbutton;
		}
		
		//Business logic 
		public void loginFunction() {
			emailTextfield.sendKeys("selenium10to12@gmail.com");
			passwordTextField.sendKeys("Selenium@123");
			loginbutton.click();
		}
		
}
