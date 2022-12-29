package steps;

import Page.utils.SeleniumDriver;
import cucumber.api.java.Before;

public class BeforeActions {
	@Before
	public void setup()
	{
		System.out.println("Before");
		SeleniumDriver.setUpDriver();
	}

}
