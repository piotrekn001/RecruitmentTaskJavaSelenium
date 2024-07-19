package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.main.SeleniumSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import spyrosoftWebsiteElements.SpyrosoftWebsiteElements;

public class Steps {
    public static WebDriver driver;
    @Before
    public void testSetup(){
        driver = SeleniumSetup.createWebdriver();
    }
    @After
    public void testTeardown(){
        driver.close();
    }
    @Given("^I enter the spyrosoft website$")
    public void IEnterTheSpyrosoftWebsite(){

        driver.navigate().to("https://spyro-soft.com/");
    }
    @When("I click on (.*)$")
    public void iClickOnMenuItem(String menuItem) {
        if(menuItem.toLowerCase().contains("contact")){
            menuItem = SpyrosoftWebsiteElements.ContactMenuButtonId;
        }

        driver.findElement(By.id(menuItem)).click();
    }

}
