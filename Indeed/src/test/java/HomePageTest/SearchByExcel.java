package HomePageTest;
import java.util.*;

import base.CommonAPI;
import dataToSearch.ItemsToBeSearched;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by ahmadkarim on 1/24/17.
 */
public class SearchByExcel extends CommonAPI {

    @Test
    public void search()throws IOException,InterruptedException{
        //Create instance of Excel file reader class
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        //Page Factory class init
        PageFactorySearch.SearchItems search = PageFactory.initElements(driver, PageFactorySearch.SearchItems.class);
        //Read data from Excel File.
        String [] value = itemsToBeSearched.getData();
        System.out.println("==================JOB OPENINGS SEARCHED BY EXCEL DATA SOURCE====================");
        //Running for each loop
        for(int i=1; i<value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            String [] parts =(driver.findElement(By.xpath(".//*[@id='searchCount']")).getText()).split(" ");
            System.out.println(value[i]+" has openings of "+parts[5]);
            search.clearSearchInput();
        }
    }



}