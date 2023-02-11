package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	
	@FindBy(how=How.LINK_TEXT,using="buy + sell")
	public WebElement carsForSaleLink;
	
	@FindBy(how=How.LINK_TEXT,using="Sell My Car")
	public WebElement sellMyCarLink;
	
	@FindBy(how=How.LINK_TEXT,using="Car Reviews")
	public WebElement carReviewsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement searchCarsLink;
	
//	@FindBy(how=How.LINK_TEXT,using="Used Cars Search")
	@FindBy(how=How.LINK_TEXT,using="Used")

//	@FindBy(how=How.XPATH, using="/html/body/div[1]/header/div[3]/div/div[1]/ul/li[1]/div/div/div[1]/ul/li[2]/a")
	public WebElement usedSearchCarsLink;

}
