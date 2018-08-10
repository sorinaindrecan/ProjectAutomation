package Tests;

import Help.BaseTest;
import Pages.PersonalDataPage;
import org.junit.Test;

public class EditPersonalDataTest extends BaseTest {

    @Test
    public void secondTest() {

        PersonalDataPage dataPage=new PersonalDataPage(driver);
        dataPage.fillRestOfTheFields();
    }
}
