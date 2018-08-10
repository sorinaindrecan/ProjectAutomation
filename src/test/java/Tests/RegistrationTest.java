package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import Help.BaseTest;
import org.junit.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void firstTest() {

        HomePage homepage = new HomePage(driver);
        homepage.goToFindLoginPage();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.goToFindRegisterPage();
        RegisterPage registerPage = new RegisterPage(driver);
        String email="ynd.sorina"+System.currentTimeMillis()+"@yahoo.com";
        //modifica
        registerPage.registrationProcess(email, "Sorina", "Indrecan", "0758288221", "Bubulinu1234", "Bubulinu1234");
        registerPage.validateSuccessMessage(email);
    }
}