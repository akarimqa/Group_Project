package PageFactorySearch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ahmadkarim on 1/15/17.
 */
public class SearchItems {
    @FindBy(how = How.CSS, using = "#what")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = "#fj")
    public static WebElement searchSubmit ;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }
    public void clearSearchInput(){
        searchInput.clear();
    }



}
