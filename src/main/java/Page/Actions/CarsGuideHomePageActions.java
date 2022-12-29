package Page.Actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Page.locators.CarsGuideHomePageLocators;
import Page.utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions()
	{
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	public void moveToCarsForSaleMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.BuyAndSellLink).perform();
	}

	public void clickOnSearchCarsMenu(String searchcars){

		moveToCarsForSaleMenu();
		carsGuideHomePageLocators.SearchCarsLink.click();

	}

	public void clickOnUsedSearchCarsMenu() {
		 moveToCarsForSaleMenu();
		carsGuideHomePageLocators.UsedCarLinkLink.click();

	}
	

}
