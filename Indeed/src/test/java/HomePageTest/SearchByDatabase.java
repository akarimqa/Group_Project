package HomePageTest;

import PageFactorySearch.SearchItems;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ConnectDB;

import java.util.List;

/**
 * Created by ahmadkarim on 1/24/17.
 */
public class SearchByDatabase extends CommonAPI {

     @Test
    public void searchUsingDB()throws Exception,InterruptedException{
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        //Read Data From Database
        ConnectDB db = new ConnectDB();
         System.out.println("databsse connected");
        List<String> st = db.readDataBase("indeedTable", "jobType" );
         System.out.println("==================SOURCE:JOB OPENINGS SEARCHED BY MYSQL DB ====================");
        for(String data:st) {
            search.searchFor(data);
            sleepFor(2);
            search.clearSearchInput();
        }
    }

}
