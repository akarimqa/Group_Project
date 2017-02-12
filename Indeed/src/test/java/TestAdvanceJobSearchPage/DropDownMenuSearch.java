package TestAdvanceJobSearchPage;


import advanceJobSearchPage.JobSearchDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by rrt on 12/26/2015.
 */
public class DropDownMenuSearch extends JobSearchDropDown {

    @Test(priority = 1)
    public void testJobTypeDropDown() throws Exception {
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.dropDownMethod("jt");
    }

    @Test(priority = 2)
    public void testJobSiteDropDown() throws Exception {
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.dropDownMethod("st");
    }

    @Test(priority = 3)
    public void testJobLocationDropDown() throws Exception {
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.dropDownMethod("radius");

    }

    @Test(priority = 4)
    public void testJobDisplayDropDown() throws Exception {
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.dropDownMethod("limit");

    }

    @Test(priority = 5)
    public void testJobSortDropDown() throws Exception {
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.dropDownMethod("sort");

    }


}

