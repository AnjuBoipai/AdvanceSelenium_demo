package pom_Script;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadsPage {
	
	@FindBy(xpath="//a[text()='3rd Album']/../../..//input[@value='Add to cart']")
	private WebElement ThirdAlbum;
	
	
	@FindBy(xpath="(//a[text()='Music 2'])[1]/../../..//input[@value='Add to cart']")
	private WebElement music;
	
	@FindBy(xpath="(//a[text()='Music 2'])[2]/../../..//input[@value='Add to cart']")
	private WebElement music2;

	public WebElement getThirdAlbum() {
		return ThirdAlbum;
	}

	public WebElement getMusic() {
		return music;
	}

	public WebElement getMusic2() {
		return music2;
	}

}
