package HomePageAllLinksTest;

import allLandingPageLinks.AllLinks;
import landingPage.UiLoginPage;
import methods.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by ahmadkarim on 1/27/17.
 */
public class TestAllLinks extends commonMethods {
    @Test(priority = 0)
    public void TestFindJobLink() throws Exception{
        AllLinks allLinks=PageFactory.initElements(driver,AllLinks.class);
        allLinks.FindJobsLink.click();
        sleepFor(2);
        allLinks.FindJobsLinkTarget.isDisplayed();
    }
    @Test(priority = 1)
    public void TestFindResumeLink() throws Exception{
        AllLinks allLinks=PageFactory.initElements(driver,AllLinks.class);
        allLinks.FindResumesLink.click();
        sleepFor(2);
        allLinks.FindResumesLinkTarget.isDisplayed();
    }
    @Test(priority = 2)
    public void TestEmpPostJobLink() throws Exception{
        AllLinks allLinks=PageFactory.initElements(driver,AllLinks.class);
        allLinks.EmpPostJobLink.click();
        sleepFor(2);
        allLinks.EmpPostJobLinkTarget.isDisplayed();
    }
    @Test(priority = 3)
    public void TestUploadLink() throws Exception{
        AllLinks allLinks=PageFactory.initElements(driver,AllLinks.class);
        allLinks.UploadLink.click();
        sleepFor(2);
        allLinks.UploadLinkTarget.isDisplayed();
    }
    @Test(priority = 4)
    public void TestPostResumeLink() throws Exception{
        AllLinks allLinks=PageFactory.initElements(driver,AllLinks.class);
        allLinks.PostResumeLink.click();
        sleepFor(2);
        allLinks.PostResumeLinkTarget.isDisplayed();
    }
    @Test(priority = 5)
    public void TestLoginLink() throws Exception{
        AllLinks allLinks=PageFactory.initElements(driver,AllLinks.class);
        allLinks.LoginLink.click();
        sleepFor(2);
        allLinks.LoginLinkTarget.isDisplayed();
    }
}
