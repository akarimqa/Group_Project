package landingPage;

import methods.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ahmadkarim on 1/24/17.
 */
public class UiLoginPage extends commonMethods {



        @FindBy(how = How.XPATH, using = ".//*[@id='userOptionsLabel']")
    public static WebElement userLoginButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='signin_email']")
    public static WebElement userLoginName;
    @FindBy(how = How.XPATH, using = ".//*[@id='signin_password']")
    public static WebElement userLoginPassword;
    @FindBy(how = How.XPATH,using = ".//*[@id='signin_remember']")
    public static WebElement signinRemember;
    @FindBy(how = How.XPATH, using = ".//*[@id='loginform']/button")
    public static WebElement signinSubmit;

    @FindBy(how = How.XPATH, using = ".//*[@id='userOptionsLabel']/span/b")
    public static WebElement userLoggedin;

    @FindBy(how = How.XPATH, using = ".//*[@id='container']/div/div/div[2]/a[1]/div")
    public static WebElement blankEntryMassage;
    @FindBy(how = How.XPATH, using = ".//*[@id='signin_password_grp']/div")
    public  static WebElement incorrectEntryMassage;
    @FindBy(how = How.XPATH, using = ".//*[@id='signin_password_grp']/div")
    public static WebElement wrongUserPasswordMassage;


}
