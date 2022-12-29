package steps;

import java.util.List;

import org.testng.Assert;

import Page.Actions.CarsGuideHomePageActions;
import Page.Actions.UsedSearchCarActions;
import Page.utils.SeleniumDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsedCarSearchPageStepDef {

	UsedSearchCarActions usedSearchCarActions = new UsedSearchCarActions();
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	@Given("^I navigate to the  Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_navigate_to_the_Home_Page_of_CarsGuide_Website(String URL) throws Throwable {
		SeleniumDriver.openPage(URL);
		SeleniumDriver.waitForPageToLoad();
	}

	@When("^I move to Car-For-Sale Menu$")
	public void i_move_to_Car_For_Sale_Menu() throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		carsGuideHomePageActions.moveToCarsForSaleMenu();
	}

	@When("^click on submenu Used Cars Search link$")
	public void click_on_submenu_Used_Cars_Search_link() throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		carsGuideHomePageActions.clickOnUsedSearchCarsMenu();

	}

	@When("^select carMaker from AnyMake dropdown$")
	public void select_carMaker_from_AnyMake_dropdown(List<String> list) throws Throwable {

		String carBrand = list.get(1);
		SeleniumDriver.waitForPageToLoad();
		usedSearchCarActions.selectCarMaker(carBrand);
		System.out.println("Car brand is : " + carBrand);
	}

	@When("^select  car model$")
	public void select_car_model(List<String> list) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		String carModel = list.get(1);
		usedSearchCarActions.selectCarModel(carModel);
		System.out.println("Car Model is : " + carModel);
	}

	@When("^select location  from SelectLocation dropdown$")
	public void select_location_from_SelectLocation_dropdown(List<String> list) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		String location = list.get(1);
		usedSearchCarActions.selectLocation(location);
		System.out.println("Selected Location : " + location);

	}

	/*@When("^select price$")
	public void select_price(List<String> list) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		String price = list.get(1);
		usedSearchCarActions.selectPrice(price);
		System.out.println("Price : " + price);
	}*/
	@When("^select price from the below list$")
	public void select_price_from_the_below_list(List<String> list) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		String price = list.get(1);
		usedSearchCarActions.selectPrice(price);
		System.out.println("Price : " + price);
	}


	@When("^click on Find_My_Car button$")
	public void click_on_Find_My_Car_button() throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		usedSearchCarActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of Used cars$")
	public void i_should_see_list_of_Used_cars() throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		System.out.println("Verified List of car details appered..!!!");
	}

	@Then("^the page title should match expected title  \"([^\"]*)\"$")
	public void the_page_title_should_match_expected_title(String expectedTitle) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println("Expected Titile :" + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);

	}

}
