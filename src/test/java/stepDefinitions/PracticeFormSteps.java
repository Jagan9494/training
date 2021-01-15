package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.PracticeForm;

public class PracticeFormSteps {
	WebDriver driver;
	WebDriverManager webDriverManager;
	PageObjectManager pageObjectManager;	
	PracticeForm practiceForm;
	private  ConfigFileReader cfr=null;

  public void init() {
	  webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		practiceForm = pageObjectManager.getPracticeForm();
		  
	  
  }
	
	@Given("^open Browser with url$")
	public void upenBroweserWithUrl(){
	
		init();
		FileReaderManager fr=FileReaderManager.getInstance();
		 cfr=fr.getConfigReader();

		driver.get(cfr.getApplicationUrl());

	}

	@When("^fill FormDetails \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\\\"]*)\"$")
		public void fillFormDetails(String firstName,String lastName,String sex, String profision,String yerasOfExp, String Date)  {
		
		init();
		
		practiceForm.fillFormDeatials(firstName, lastName, sex, yerasOfExp, Date, profision);
	}


	
}
