package Steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Assertions {

    @Then("I assert that I have been taken to (.*)$")
    public void iAssertThatIHaveBeenTakenToURI(String URI) {
        String url = Steps.driver.getCurrentUrl();
        Assert.assertTrue(url.contains(URI));
    }
}
