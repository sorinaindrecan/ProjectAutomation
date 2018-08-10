package Help;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.bonprixro.eu/?utm_source=HURRA_google&utm_medium=cpc&utm_campaign=HURRA_brand");
        driver.manage().window().maximize();
    }

//    @After
//    public void tearDown() {
//        driver.quit();
//
//    }
}

