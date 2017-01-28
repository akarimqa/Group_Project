package methods;
import java.io.IOException;
import java.util.*;

import advanceJobSearchPage.JobSearchDropDown;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.DataReader;

import static landingPage.UiLoginPage.*;

/**
 * Created by ahmadkarim on 1/23/17.
 */
public class commonMethods extends CommonAPI {
    //***If Need to use Actual UserName and Password
    public static final String IndeedUser="mrmbillah@gmail.com";
    public static final String IndeedPass="A@101089";
    //*** UserName and Password come from System Environment Variable
//    public static final String IndeedUser = System.getenv("IndeedUser");
//    public static final String IndeedPass = System.getenv("IndeedPass");

    public void login(String userLoginName1, String userLoginPassword1) {
        userLoginButton.click();
        userLoginName.sendKeys(userLoginName1);
        userLoginPassword.sendKeys(userLoginPassword1);

        if (signinRemember.isSelected()) {
            signinRemember.click();
        }

        if (signinSubmit.isEnabled()) {
            signinSubmit.click();
        }


    }

    public String loggedinUser() {
        String txt = userLoggedin.getText();
        return txt;
    }

    public String actualMessageBlank() {
        String txt = blankEntryMassage.getText();
        return txt;
    }

    public String actualWrongUserPasswordMassage() {
        String txt = wrongUserPasswordMassage.getText();
        return txt;
    }
public void selectionOfDropDownMethod(String visibleText, String path){
    Select dropDown=new Select(driver.findElement(By.xpath(path)));
    dropDown.deselectByValue(visibleText);

}
public void searchDropDownMethod(String item){
    JobSearchDropDown jobSearchDropDown=PageFactory.initElements(driver, JobSearchDropDown.class);



}


}

