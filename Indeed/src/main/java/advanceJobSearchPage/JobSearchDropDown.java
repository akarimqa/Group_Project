package advanceJobSearchPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmadkarim on 1/27/17.
 */
public class JobSearchDropDown extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='jobsearch']/table/tbody/tr[5]/td[3]/a")
    public static WebElement advanceSearchLink;
    @FindBy(how = How.XPATH, using = ".//*[@id='jt']")
    public static WebElement jobContractType;
    @FindBy(how = How.XPATH, using = ".//*[@id='fj']")
    public static WebElement advanceSearchSubmit;

    public void advanceSearchFor(String iteam) {
        jobContractType.sendKeys(iteam, Keys.ENTER);
    }

    public void dropDownCheck(String idName) throws Exception {
        WebElement dropDownType = driver.findElement(By.id(idName));
        List<WebElement> dropDownItems = dropDownType.findElements(By.id(idName));
        for (int i = 0; i < dropDownItems.size(); i++) {
            String txt = dropDownItems.get(i).getText();
            Select drop = new Select(driver.findElement(By.xpath(".//*[@id='jt']")));
            drop.selectByVisibleText(txt);
            advanceSearchSubmit.click();
            //navigateBack();
        }

    }
}

