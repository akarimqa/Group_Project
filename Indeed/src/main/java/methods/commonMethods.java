package methods;
import java.io.IOException;
import java.util.*;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import static landingPage.UiLoginPage.*;

/**
 * Created by ahmadkarim on 1/23/17.
 */
public class commonMethods extends CommonAPI {
    //***If Need to use Actual UserName and Password
//    public static final String IndeedUser="mrmbillah@gmail.com";
//    public static final String IndeedPass="A@101089";
    //*** UserName and Password come from Envir
    public static final String IndeedUser=System.getenv("IndeedUser");
    public static final String IndeedPass=System.getenv("IndeedPass");

    public void login (String userLoginName1, String userLoginPassword1){
        userLoginButton.click();
        userLoginName.sendKeys(userLoginName1);
        userLoginPassword.sendKeys(userLoginPassword1);

        if(signinRemember.isSelected()){
            signinRemember.click();
        }
//Thread.sleep(1500);
        if(signinSubmit.isEnabled()){
            signinSubmit.click();
        };

    }
    public String loggedinUser(){
        String txt=userLoggedin.getText();
        return txt;
    }
    public String actualMessageBlank(){
        String txt=blankEntryMassage.getText();
        return txt;
    }

//    DataReader dr = new DataReader();
//    public String [] getData()throws IOException{
//        String path = System.getProperty("user.dir")+"/data/file1.xls";
//        String [] st = dr.fileReader(path);
//        return st;
//    }
//
//   ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
//    SearchItems search = PageFactory.initElements(driver, SearchItems.class);
//    public void searchItems()throws IOException,InterruptedException{
//        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
//        String [] value = itemsToBeSearched.getData();
//        for(int i=1; i<value.length; i++) {
//            search.searchFor(value[i]);
//            sleepFor(2);
//            search.clearSearchInput();
//        }
//    }

}
