package flipkartAutomate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

	@FindBy(className="_53J4C-")
	WebElement productSelectElement;
	
	@FindBy(className="BHPsUQ")
	WebElement invalidProductMessage;
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectProduct() {
		waitFun(driver,productSelectElement);
		productSelectElement.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isSearchResultDisplayed(){
		return productSelectElement.isDisplayed();
	}
	
	public boolean isInvalidMessageDisplayed() {
		return invalidProductMessage.isDisplayed();
	}
	
	
}
