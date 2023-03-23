package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CahsWiseLoginPage;
import utilities.Driver;
import utilities.Flow;

public class CashwiseLogin_steps {

    CahsWiseLoginPage cashwisepage = new CahsWiseLoginPage();

    @Given("user is on cashwise application")
    public void user_is_on_cashwise_application() {
        Driver.getDriver().get("https://cashwise.us/");
    }

    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        cashwisepage.signInLink.click();
    }

    @When("user logs in {string} and {string}")
    public void user_logs_in_and(String email, String password) {

        cashwisepage.cashwiseLogin(email, password);
    }

    @Then("user should land on {string} page")
    public void user_should_land_on_page(String url) {
        Flow.wait(2000);
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url, actualURL);
    }

    @Then("user sees error message {string} and {string}")
    public void user_sees_error_message_and(String emailError, String passwordError) {

        String actualEmailMessage=cashwisepage.emailErrorMessage.getText().trim();
        String actualPasswordErrorMessage=cashwisepage.passwordErrorMessage.getText().trim();

        Assert.assertEquals(emailError,actualEmailMessage);
        Assert.assertEquals(passwordError,actualPasswordErrorMessage);

    }

}
