package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pages.DemoBlazeSignUpPage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

import java.util.Random;

public class DemoBlazeSignUp_steps {


    //if(username.equals("mira")){
    // username = username +new Random().nextInt(100000)}
        DemoBlazeSignUpPage demoBlazePage=new DemoBlazeSignUpPage();


    @Given("user is on demo blaze application")
    public void user_is_on_demo_blaze_application() {

        Driver.getDriver().get(Config.getValue("demoblazeURL"));
    }

    @Given("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {
     demoBlazePage.signUpBtn.click();
        Flow.wait(500);



    }


    @When("user enters  credentials {string} and {string} and clicks sign up")
    public void user_enters_credentials_and_and_clicks_sign_up(String username, String password) {

        if(username.equals("mira")){
            username = username +new Random().nextInt(100000);
        }
        System.out.println("Username: "+ username);
        demoBlazePage.formUsernameInputBox.sendKeys(username);
        demoBlazePage.formPasswordInputBox.sendKeys(password);
        demoBlazePage.formSignUpBtn.click();
        Flow.wait(1000);

    }
    @Then("user should see alert message {string}")
    public void user_should_see_alert_message(String message) {
        Alert signUpAlert = Driver.getDriver().switchTo().alert();
        String actualMessage = signUpAlert.getText();
        Assert.assertEquals(message, actualMessage);


    }
}
