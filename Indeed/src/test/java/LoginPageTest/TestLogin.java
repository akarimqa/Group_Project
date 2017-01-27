package LoginPageTest;

import base.CommonAPI;

import landingPage.UiLoginPage;
import methods.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ahmadkarim on 1/24/17.
 */
public class TestLogin extends commonMethods {
    @Test(priority = 1)
    public void testLoginBlank() throws Exception{
        UiLoginPage uiLoginPage= PageFactory.initElements(driver, UiLoginPage.class);

        uiLoginPage.login("","");
        sleepFor(2);
        String actual=uiLoginPage.actualMessageBlank();
        String expected="Not a member? Create an account free";
        Assert.assertEquals(actual,expected);
    }

    @Test(priority = 2)
    public void testLoginIncorrectUseName()throws Exception{
        UiLoginPage uiLoginPage= PageFactory.initElements(driver, UiLoginPage.class);
        uiLoginPage.login("abcdef",commonMethods.IndeedPass);
sleepFor(2);
    }
    @Test(priority = 3)
    public void testLoginIncorrectPass() throws Exception{
        UiLoginPage uiLoginPage= PageFactory.initElements(driver, UiLoginPage.class);
        uiLoginPage.login(commonMethods.IndeedUser,"123456");
sleepFor(2);
    }
    @Test(priority = 4)
    public void testLoginCorrectCredentials()throws Exception{
        UiLoginPage uiLoginPage= PageFactory.initElements(driver, UiLoginPage.class);
        uiLoginPage.login(commonMethods.IndeedUser,commonMethods.IndeedPass);
        String actual=uiLoginPage.loggedinUser();
        Assert.assertEquals(actual,commonMethods.IndeedUser);
sleepFor(2);
    }

}
