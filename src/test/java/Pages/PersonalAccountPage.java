package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalAccountPage {
    WebDriver driver;

    public PersonalAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='col-md-8 col-xs-9 pull-right']//a[@href='/contul-meu/noauthorized/show']")
    private WebElement mydata;

    public PersonalDataPage goToFindPersonalDataPage() {
        mydata.click();
        return new PersonalDataPage(driver);
    }
}
