package HomePageTest;

import landingPage.UiLandingPage;
import methods.commonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by ahmadkarim on 1/23/17.
 */
public class TestLandingPage extends commonMethods {
    @Test(priority = 0)
    public void testBlankLogin() throws Exception{

        UiLandingPage uiLandingPage=PageFactory.initElements(driver,UiLandingPage.class);
uiLandingPage.landingPageSearch("Selenium Tester", "NYC,NY");


    }
}
