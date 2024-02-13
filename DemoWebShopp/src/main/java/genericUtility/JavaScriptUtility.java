package genericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends WebDriverUtility {
public void scrollBy(int x,int y) {
	
	js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
}

//@param x
//@param y

public static void scrollTo(int x,int y) {
	js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo("+x+","+y+")");

}
 //this method is used to scroll the page util the element is visible 
//@param b
//@param element
//@param index
public static void scrollToView(Boolean b,WebElement element,int index) {
	js=(JavascriptExecutor)driver;
	js.executeScript("+arguments["+index+"].scrollToView("+b+");,"+element+"");
}
public static void ClickDisable(WebElement element) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",element);

}

}
