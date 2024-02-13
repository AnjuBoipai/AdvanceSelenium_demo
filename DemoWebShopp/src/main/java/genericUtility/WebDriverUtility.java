package genericUtility;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public static WebDriver driver;
	 public static WebDriverWait wait;
	 public static Select s;
	 public static Actions a;
	 public static JavascriptExecutor js;
	 public static Properties p;
	 
	 
	 public static void getUrl(String url) {
		 driver.get(url);
	 }
	 //this method is used to get current Url 
	 
	 public static String getCurrentUrl(){
		 return driver.getCurrentUrl();
		}
	 
	 public static String getPageSource() {
		 return driver.getPageSource();
		 }
	 
	 public static void maximize() {
			driver.manage().window().maximize();

		 }
	 
	 public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		 }
	 
	 public static String getTitle() {
		 return driver.getTitle();
	 }
	 
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static String CurrentWindow() {
		return 	driver.getWindowHandle();
		}
	
	public static Set<String> allWindow(){
		return driver.getWindowHandles();
	}
	public static Navigation tonavigate() {
		return driver.navigate();
	}
	 public static void backword() {
		 driver.navigate().back();
	 }
	
	
	public static void forword() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
public static void toStringUrl(String url) {
	driver.navigate().to(url);
}
 
public static void ExplicitWait(WebElement element) {
	wait= new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(element));
}

public static  void DropDown(int i,WebElement element) {
	s=new Select(element);
	s.selectByIndex(i);
}

public static void DropDown1(String value,WebElement element) {
	s=new Select(element);
	s.selectByValue(value);
}

public static void DropDown(String Visible,WebElement element) {
	s=new Select(element);
	s.selectByVisibleText(Visible);
}


public static void moveElement(WebElement element) {
	a=new Actions(driver);
    a.moveToElement(element).perform();;
    
}

public static void contextClick(WebElement element) {
	a=new Actions(driver);
    a.contextClick(element).perform();
}
    public static void doubleClick1(WebElement element) {
    	a=new Actions(driver);
        a.doubleClick(element).perform();

    }
    
    public static void dragAndDrop(WebElement source,WebElement Destination) {
    	a=new Actions(driver);
      
		a.dragAndDrop(source, Destination).perform();

    }
    public static void click(WebElement element) {
    	a=new Actions(driver);
        a.doubleClick(element).perform();

}
    public static void Click() {
    	a=new Actions(driver);
        a.click().perform();


    }
}
