package Page.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Page.locators.UsedCarSearchPageLocators;
import Page.utils.SeleniumDriver;

public class UsedSearchCarActions {

	UsedCarSearchPageLocators usedCarSearchPageLocators = null;

	public UsedSearchCarActions() {
		this.usedCarSearchPageLocators = new UsedCarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocators);
	}

	public void selectCarMaker(String carBrand) {

		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='makes']")).click();

		Select selectCarMaker = new Select(usedCarSearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText(carBrand);

	}

	public void selectCarModel(String carModel) {
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='models']")).click();

		Select selectCarModel = new Select(usedCarSearchPageLocators.selectModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}

	public void selectLocation(String location) {
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='locations']")).click();

		Select selectLocation = new Select(usedCarSearchPageLocators.selectLocation);
		selectLocation.selectByVisibleText(location);
	}

	public void selectPrice(String price) {
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='priceTo']")).click();
		Select selectPrice = new Select(usedCarSearchPageLocators.priceList);
		selectPrice.selectByVisibleText(price);
	}

	public void clickOnFindMyNextCarButton() {

		usedCarSearchPageLocators.findMyNextCarButton.click();

	}

}
