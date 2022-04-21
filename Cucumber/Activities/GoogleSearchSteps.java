/*
This is a simple Google Search activity to understand the syntax of Feature and Step Definition files.
In the Features folder, add a new file named "Activity1.feature".
If you have the Cucumber Eclipse plugin installed, it will fill the file with template code.
All the comments can be deleted. The Scenario Outline can also be removed for this activity, including the Examples section.
Leave the tag above the Feature. We will be using that tag to identify which Features to run the test for.
Rewrite the tag above Feature to "@activity1".
Name the Feature: "First Test"
Name the Scenario: "Opening a webpage using Selenium"

Add a GIVEN statement "User is on Google Home Page"
Add a WHEN statement "User types in Cheese and hits ENTER"
Add a THEN statement "Show how many search results were shown"
Add a AND statement "Close the browser"
Your Feature file should look like this:

@activity1
Feature: First Test
@SmokeTest
Scenario: Opening a webpage using Selenium
    Given User is on Google Home Page
    When User types in Cheese and hits ENTER
    Then Show how many search results were shown
    And Close the browser

Now that the Feature file is done, we move on the Step Definitions
In stepDefinition Package, add a new Java Class named "GoogleSearchSteps"
Import all the packages that will be used
Every Step Definition must be written in the following way:

@Given("^ Statement set in Feature file for Given $")
public void givenFunctionName() {}
@When("^ Statement set in Feature file for When $")
public void whenFunctionName() {}
@Then("^ Statement set in Feature file for Then $")
public void thenFunctionName() {}

In the @Given step,

Initialize the driver and wait instance.
Use get() to open the Google home page.
In the @When step,
Use findElement() to find the search bar and enter "Cheese" in it and emulate hitting ENTER.
In the @Then step,
Wait till the results stats are shown.
Use getText() to get the text and print it.
In the @And Step,
close() the browser

To run the test, right click on Test Runner Class, ActivitiesRunner, and select Run.
On Eclipse, to run, select Run As -> JUnit Test
You should see the actions happen in an automated browser.
 */

package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Google Home Page$")
    public void userIsOnGooglePage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);

        //Open the browser
        driver.get("https://www.google.com");
    }

    @When("^User types in Cheese and hits ENTER$")
    public void userTypesInCheeseAndHitsENTER() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
    }

    @Then("^Show how many search results were shown$")
    public void showHowManySearchResultsWereShown() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);
    }

    @And("^Close the browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
