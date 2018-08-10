package Pages;

import Help.HelperMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalDataPage {
    WebDriver driver;

    //Objects
    public HelperMethods functions=new HelperMethods(driver);

    //Constructor
    public PersonalDataPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //WebElements
    @FindBy(how=How.XPATH, using="//a[@class='btn btn-primary']")
    private WebElement editdata;
    @FindBy (how=How.ID, using="inputStreet")
    private WebElement streetField;
    @FindBy(how=How.ID, using="inputStreetNR")
    private WebElement numberOfTheStreet;
    @FindBy(how=How.ID, using="inputStreetBlock")
    private WebElement blockNumber;
    @FindBy(how=How.ID, using="inputStreetEntrance")
    private WebElement streetEntranceField;
    @FindBy(how=How.ID, using="inputStreetFloor")
    private WebElement floorField;
    @FindBy(how=How.ID, using="inputStreetLok")
    private WebElement appartmentNumberField;
    @FindBy(how=How.ID, using="inputPostCode")
    private WebElement postalCodField;
    @FindBy (how=How.ID, using="inputCity")
    private WebElement cityField;
    @FindBy (how=How.ID, using="inputBirthdayD")
    private WebElement dayOfBirth;
    @FindBy (how=How.ID, using="inputBirthdayM")
    private WebElement monthOfBirth;
    @FindBy (how=How.ID, using="inputBirthdayY")
    private WebElement yearOfBirth;
    @FindBy (how=How.XPATH, using="//button[@class='btn btn-success']")
    private WebElement saveButton;

    //Methods
    //Fill the rest of the fields from account data page
    public PersonalDataPage fillRestOfTheFields()
    {
        //Scroll down to click on Editeaza button
        JavascriptExecutor jsx=(JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,650)", " ");

        //Click on Editeaza button
        functions.clickWebElement(editdata);

        //Fill all the fields
        functions.fillWebElement(streetField,"sarmale");

        return this;
    }
}
