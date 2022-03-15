package com.Google.stepDefinitons;

import com.Google.pages.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchStepDefinitions {

    WebDriver driver;
    GoogleHomePage googleHomePage = new GoogleHomePage(driver);

    @Given("I am on the Google home page")
    public void i_am_on_the_google_home_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        Assert.assertEquals("Titles are not matched","Google",driver.getTitle());
        Thread.sleep(1000);
    }

    @When("I search for {string} and click the search button")
    public void i_search_for_and_click_the_search_button(String keyword) throws InterruptedException {
        Thread.sleep(1000);
        googleHomePage.searchFor(keyword);
        Thread.sleep(1000);
    }

    @Then("I should see the results related to {string}")
    public void i_should_see_the_results_related_to(String expectedTitle) throws InterruptedException {
        Thread.sleep(1000);
        googleHomePage.titleVerification(expectedTitle);
        driver.close();
    }


}

