package Pages;

import Help.HelperMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    //Constructor
    public LoginPage (WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    //Objects
    public HelperMethods functions= new HelperMethods(driver);

    // WebElements
    @FindBy(how=How.XPATH, using= "//a[@class='btn btn-primary btn-lg pull-right btn-bottom']")
    private WebElement deschidecont;
    @FindBy (how=How.XPATH, using="//div[@id='newsletter-subscribe']//button[@class='btn btn-default btn-close pull-right']")
    private WebElement newsletterPopUp;

    //declara elementele de login


    //Methods
    public RegisterPage goToFindRegisterPage(){
        //Check if the newsletter pop-up is display
        try {
            // WaitUntil
            functions.waitExplicit(newsletterPopUp,driver);
            if (newsletterPopUp.isDisplayed()) {
                functions.hoverWebElement(newsletterPopUp,driver);
                functions.clickWebElement(newsletterPopUp);
            }
        }
        catch (NoSuchElementException e){
        }

        //Scroll dowm the page
        JavascriptExecutor jsx=(JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,400)", " ");
        //Click on the openAccount button
        functions.waitExplicit(deschidecont, driver);
        functions.hoverWebElement(deschidecont,driver);
        functions.clickWebElement(deschidecont);
        return new RegisterPage (driver);
    }
}
