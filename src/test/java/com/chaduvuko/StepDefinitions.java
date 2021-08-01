package com.chaduvuko;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.chaduvuko.WebDriverFactory.createWebDriver;
import static org.junit.Assert.*;

public class StepDefinitions {
    private WebDriver driver;

    @BeforeClass
    public static void setUpClass(){
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void createBrowserDriver() {
//        driver = createWebDriver();
        driver = new ChromeDriver();
    }

    @Given("I have navigated to {string}")
    public void i_have_navigated_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(string);
    }

    @Then("I see webpage title as {string}")
    public void i_see_webpage_title_as(String expectedPageTitle) {
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals("<<<<<if it fails this message will appear>>>>>",actualPageTitle,expectedPageTitle);
    }

    @When("I see current URL as {string}")
    public void i_see_current_url_as(String realUrl) {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("<<<<<if it fails this message will appear>>>>>",currentUrl,realUrl);
    }

    @After()
    public void closeBrowser() {
        driver.close();
    }

}
