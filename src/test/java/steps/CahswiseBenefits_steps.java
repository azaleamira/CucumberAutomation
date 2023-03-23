package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CahsWiseLoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

import java.util.List;


public class CahswiseBenefits_steps {

    CahsWiseLoginPage cashwisePage=new CahsWiseLoginPage();
    @Given("user is on Cashwise application homepage")
    public void user_is_on_cashwise_application_homepage() {
        Driver.getDriver().get(Config.getValue("cashwiseURL"));

        //cashwisePage.cashwiseLogin("codewise@gmail.com","123456");



    }
    @When("user scrolls down to four benefits on homepage")
    public void user_scrolls_down_to_four_benefits_on_homepage() {

        Flow.scrollDown(500);
    }


    @Then("user should see all four options of the offer benefits")
    public void user_should_see_all_four_options_of_the_offer_benefits( List<String> benefits) {

        for(WebElement benefit: cashwisePage.benefitList){
            String benefitString =benefit.getText().trim();
            System.out.println(benefitString);
            Assert.assertTrue(benefits.contains(benefitString));
        }



    }

}
