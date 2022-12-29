package Page.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Page.locators.CarSearchPageLocators;
import Page.utils.SeleniumDriver;

public class CarSearchPageActions {
	
	CarSearchPageLocators carSearchPageLocators=null;
	public CarSearchPageActions()
	{
		this.carSearchPageLocators=new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
		
	}
	public void selectCarMaker(String carBrand)
	{
		
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='makes']")).click();
//		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarMaker=new Select(carSearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel)
	{
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='models']")).click();
//		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarModel=new Select(carSearchPageLocators.selectModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
	public void selectLocation(String location)
	{
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='locations']")).click();
//		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectLocation=new Select(carSearchPageLocators.selectLocation);
		selectLocation.selectByVisibleText(location);
	}
	public void selectPrice(String price)
	{
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='priceTo']")).click();
//		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectPrice=new Select(carSearchPageLocators.priceList);
		selectPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton()
	{
//		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		carSearchPageLocators.findMyNextCarButton.click();
		
	}
	

}
