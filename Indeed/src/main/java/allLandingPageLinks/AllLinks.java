package allLandingPageLinks;

import methods.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ahmadkarim on 1/26/17.
 */
public class AllLinks extends commonMethods {
    @FindBy(how= How.XPATH, using = ".//*[@id='jobsLink']")
    public static WebElement FindJobsLink;
    @FindBy(how = How.XPATH, using = ".//*[@id='viewport']/div[2]/table/tbody/tr[1]/td/img")
    public static WebElement FindJobsLinkTarget;
    @FindBy(how = How.XPATH, using = ".//*[@id='rezLink']")
    public static WebElement FindResumesLink;
    @FindBy(how = How.XPATH, using = ".//*[@id='indeed_logo']")
    public static WebElement FindResumesLinkTarget;
    @FindBy(how = How.XPATH, using = ".//*[@id='empLink']")
    public static WebElement EmpPostJobLink;
    @FindBy(how = How.XPATH, using = ".//*[@id='index-jan15']/div[1]/header/div/div/div/div/a[1]")
    public static WebElement EmpPostJobLinkTarget;
    @FindBy(how = How.XPATH, using = ".//*[@id='navpromo']/a")
    public static WebElement UploadLink;
    @FindBy(how = How.XPATH, using = ".//*[@id='container']/div/div[2]/div[1]/img")
    public static WebElement UploadLinkTarget;
    @FindBy(how = How.XPATH, using = ".//*[@id='resPromoDisplay']/a[2]/b")
    public static WebElement PostResumeLink;
    @FindBy(how = How.XPATH, using = ".//*[@id='container']/div/div[2]/div[1]/img")
    public static WebElement PostResumeLinkTarget;
    @FindBy(how = How.XPATH, using = ".//*[@id='userOptionsLabel']")
    public static WebElement LoginLink;
    @FindBy(how = How.XPATH, using = ".//*[@id='branding']/a/div")
    public static WebElement LoginLinkTarget;
}
