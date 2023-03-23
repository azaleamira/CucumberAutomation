package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CahsWiseLoginPage {


    /*
    Login Negative

    As an admin . I should not be able to login to Cashwise with invalid
    credentials
    1.Create feature file for CahswiseLoginNegative
    2. Generate steps using Gherkin Language
    3. Generate code template for implementation
    4.Create page class for CahswiseLogin
    5.Locate login related web elements
    6.Implement cashwise login negative scenario
    7.Provide set of test data for invLID credentials as below:

    | email | password |
    | test | test |
    |hi@test.com | test |
    |            | test |
    |hi@test     |      |

     */

    public CahsWiseLoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


     @FindBy(xpath="//button[.='Sign in']")
    public WebElement signInLink;

    @FindBy(xpath="(//input[@name='email'])[2]")
    public WebElement emailInput;

    //@FindBy(xpath="//input[@name='password']")
    @FindBy(name="password")
    public WebElement passwordInput;

    @FindBy(xpath="(//button[@type='submit'])[2]")
    public WebElement signInButton;


    public void cashwiseLogin(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.click();
    }



    @FindBy(xpath="(//form)[2]//p[1]")
    public WebElement emailErrorMessage;


    //@FindBy(xpath="(//form)[2]//p[2]")
    //@FindBy(xpath="((//form)[2]//p[1])[2]")
    @FindBy(xpath="(//form/div/p)[2]")
    public WebElement passwordErrorMessage;


    //@FindBy(xpath="//div[@class='css-976bd8']/div/h3")
    @FindBy(xpath="//h2[.='We offer']/../h3")
    public List<WebElement> benefitList;
}
