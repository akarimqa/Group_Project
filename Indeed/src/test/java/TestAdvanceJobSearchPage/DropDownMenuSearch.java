package TestAdvanceJobSearchPage;


import advanceJobSearchPage.JobSearchDropDown;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static advanceJobSearchPage.JobSearchDropDown.advanceSearchLink;
import static advanceJobSearchPage.JobSearchDropDown.advanceSearchSubmit;

/**
 * Created by rrt on 12/26/2015.
 */
public class DropDownMenuSearch extends JobSearchDropDown {

    @Test(priority = 1)
    public void testJobTypeDropDown() throws InterruptedException{
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.advanceSearchFor("jt");
    }
    @Test(priority = 2)
    public void testJobSiteDropDown() throws InterruptedException{
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.advanceSearchFor("st");
    }
    @Test(priority = 3)
    public void testJobLocationDropDown() throws InterruptedException{
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.advanceSearchFor("radius");
    }
    @Test(priority = 4)
    public void testJobDisplayDropDown() throws InterruptedException{
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.advanceSearchFor("limit");
    }
    @Test(priority = 5)
    public void testJobSortDropDown() throws InterruptedException{
        JobSearchDropDown jobSearchDropDown = PageFactory.initElements(driver, JobSearchDropDown.class);
        advanceSearchLink.click();
        jobSearchDropDown.advanceSearchFor("sort");
    }


}

