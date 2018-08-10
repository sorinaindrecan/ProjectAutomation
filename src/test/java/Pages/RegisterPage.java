package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    //Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "inputEmail")
    private WebElement emailField;
    @FindBy(how = How.ID, using = "inputName")
    private WebElement lastNameField;
    @FindBy(how = How.ID, using = "inputSurname")
    private WebElement firstNameField;
    @FindBy(how = How.ID, using = "inputPhoneMobile")
    private WebElement mobilePhoneNumberField;
    @FindBy(how = How.ID, using = "inputPassword")
    private WebElement passwordField;
    @FindBy(how = How.ID, using = "inputPassword2")
    private WebElement confirmPasswordField;
    @FindBy(how = How.XPATH, using = "//div[@class='has-discount-box']/div[2]/label/i")
    private WebElement newsLetterCheckbox;
    @FindBy(how = How.XPATH, using = "//div[@class='has-discount-box']/div[3]/label/i")
    private WebElement agreementCheckbox;
    @FindBy(how = How.XPATH, using = "//input[@class='btn btn-success pull-right btn-lg']")
    private WebElement continueButton;
    @FindBy(how=How.XPATH, using = "//div[@class='alert alert-success ']/span")
    private WebElement successMessage;

    //Methods

    public RegisterPage registrationProcess(String email, String lastName, String firstName, String phoneNumber, String password, String confirmPassword)
    {
        //Scroll dowm the page
        JavascriptExecutor jsx=(JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,150)", " ");

        //Complete fields
        emailField.sendKeys(email);
        lastNameField.sendKeys(lastName);
        firstNameField.sendKeys(firstName);
        mobilePhoneNumberField.sendKeys(phoneNumber);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(confirmPassword);

        //Scroll down a bit
        jsx.executeScript("window.scrollBy(0,150)", " ");

        //Click on Continue button
        //foloseste functin
        newsLetterCheckbox.click();
        agreementCheckbox.click();
        continueButton.click();
        return this;
    }

    //Validate the final message for creating a new account
    public RegisterPage validateSuccessMessage(String value)
    {
        String actualValue=successMessage.getText();
        if(!(actualValue.isEmpty()))
        {
            if(actualValue.contains(value))
            {
                System.out.println("The success message contains the email entered");
            }
        }
        return this;
    }


}

//Make another function for validate the RegisterPage

