package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {



    @After
    public void cleanUp(Scenario scenario){
        //what do we know at this point ?
        //I want to check the status of the scenario .
        //Did it pass or fail?
        //If the scenario passed I don't write any "comments"
        //Only if it fails I want to take a screenshot and attach to teh report
        System.out.println(scenario.getStatus());

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);//we are taking screenshots using Screenshot Interface
            scenario.attach(screenshot,"image/png", scenario.getName());
        }

        Driver.quitBrowser();
    }


}
