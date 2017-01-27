package HomePageTest;

import PageFactorySearch.SearchItems;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by ahmadkarim on 1/24/17.
 */
public class SearchByDataprovider extends CommonAPI {

    //One Data Driven Option to supply search.data from Data Provider
    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Selenium Test"} ,
                {"QTP"} ,
                {"Mobile Testing"},
                {"Manual Test"},

        };
    }

    @Test(dataProvider = "items")
    public void searchUsingDataProvider(String data)throws InterruptedException{
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        search.searchFor(data);
        sleepFor(2);
//Gives the result from job search
        String [] parts =(driver.findElement(By.xpath(".//*[@id='searchCount']")).getText()).split(" ");
       System.out.println(data +" has openings of "+ parts[5]);

        search.clearSearchInput();
    }

}
