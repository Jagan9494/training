package browserCommonActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserActions {
	WebDriver driver;
	
	BrowserActions(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void click(WebElement ele) {
		
		ele.click();
	}
	
public void jsClick(WebElement ele) {
		
		
	//ele.click();
	}
	
	

}
