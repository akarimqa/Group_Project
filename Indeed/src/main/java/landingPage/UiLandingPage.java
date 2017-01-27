package landingPage;


import methods.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ahmadkarim on 1/23/17.
 */
public class UiLandingPage extends commonMethods {
    @FindBy(how= How.CSS, using = "#what")
    public static WebElement jobType;
    @FindBy(how=How.CSS, using = "#where")
    public static WebElement jobLocation;
    @FindBy(how = How.CSS, using = "#fj")
    public static WebElement findJobButton;

    

    public void landingPageSearch(String jobType1, String jobLocation1){
        jobType.clear();
jobType.sendKeys(jobType1);
jobLocation.clear();
jobLocation.sendKeys(jobLocation1);
findJobButton.click();
    }
}
