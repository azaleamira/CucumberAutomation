package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.DemoBlazeSignUpPage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;
import utilities.TempDataStorage;

public class DemoBlazeLogin_steps {

    DemoBlazeSignUpPage blazehomepage=new DemoBlazeSignUpPage();





    @Given("user clicks on log in button for demoblaze")
    public void user_clicks_on_log_in_button_for_demoblaze() {
    blazehomepage.loginButton.click();
        Flow.wait(500);


    }
    @When("user enters credentials {string} and {string} and clicks login")
    public void user_enters_credentials_and_and_clocks_login(String username, String password) {
        TempDataStorage.addData("username",username);
        TempDataStorage.addData("password",password);
        blazehomepage.loginUsernameInputBox.sendKeys(username); //username mira1234
        blazehomepage.loginPasswordInputBox.sendKeys(password); //password mira1234
        blazehomepage.formLoginButton.click();
        Flow.wait(1000);


    }
    @Then("user should successfully login to application")
    public void user_should_successfully_login_to_application() {
        String username = TempDataStorage.getData("username");
        String linkText="Welcome "+username;
        WebElement welcomeUser= Driver.getDriver().findElement(By.linkText(linkText));
        Assert.assertTrue(welcomeUser.isDisplayed());



    }


}
