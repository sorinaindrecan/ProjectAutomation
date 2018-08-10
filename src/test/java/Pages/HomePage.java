package Pages;

import Help.HelperMethods;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    //Objects
    public HelperMethods functions=new HelperMethods(driver);

    public HomePage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how=How.XPATH, using="//div[@class='top-nav pull-right']//a[@href='/contul-meu/']")
    private WebElement myAccount;




    //Methods
    public PersonalAccountPage goToFindMyAccountPage (){
        myAccount.click();
        return new PersonalAccountPage(driver);
    }

    public LoginPage goToFindLoginPage (){
        functions.waitExplicit(myAccount,driver);
        myAccount.click();
        return new LoginPage(driver);
    }


}