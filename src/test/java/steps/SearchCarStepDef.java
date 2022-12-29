package steps;

import java.util.List;

import org.testng.Assert;

import Page.Actions.CarSearchPageActions;
import Page.Actions.CarsGuideHomePageActions;
import Page.utils.SeleniumDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarStepDef {
	
	CarSearchPageActions carSearchPageActions=new CarSearchPageActions();
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String URL) throws Throwable {
		SeleniumDriver.openPage(URL);
	    
	}

	@When("^I move to Car For Sale Menu$")
	public void i_move_to_Car_For_Sale_Menu(List<String> list) throws Throwable {
	    String menu=list.get(1);
	    System.out.println("Menu Selected : "+menu);
	    carsGuideHomePageActions.moveToCarsForSaleMenu();
	    
	}

	@When("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchcars) throws Throwable {
	    SeleniumDriver.waitForPageToLoad();
	    carsGuideHomePageActions.clickOnSearchCarsMenu(searchcars);
	}

	@When("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_carbrand_as_from_AnyMake_dropdown(String carBrand) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		carSearchPageActions.selectCarMaker(carBrand);
		
	}

	@When("^select \"([^\"]*)\" as car model$")
	public void select_as_car_model(String carModel) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		carSearchPageActions.selectCarModel(carModel);
	}

	@When("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_as_from_SelectLocation_dropdown(String location) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		carSearchPageActions.selectLocation(location);
	}

	@When("^select \"([^\"]*)\" as price$")
	public void select_as_price(String price) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		carSearchPageActions.selectPrice(price);
	}

	@When("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		carSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		 System.out.println("Car List Found");
	}

	@Then("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedTitle) throws Throwable {
		SeleniumDriver.waitForPageToLoad();
		String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
	    System.out.println("Actual page title-->"+ActualPageTitle);
	    System.out.println("Expected page title-->"+expectedTitle);
	    Assert.assertEquals(expectedTitle, ActualPageTitle);
		
		
	}
	
	
	}
