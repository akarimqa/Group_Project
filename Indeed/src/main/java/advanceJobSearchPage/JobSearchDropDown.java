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
    @FindBy(how = How.XPATH, using = "html/body/form/table/tbody/tr[2]/td/table/tbody/tr[8]/td[2]/select")
    public static WebElement jobContractType;
    @FindBy(how = How.XPATH, using = "html/body/form/table/tbody/tr[2]/td/table/tbody/tr[16]/td/span/span/input")
    public static WebElement advanceSearchSubmit;
    @FindBy(how = How.XPATH, using = ".//*[@id='jt']")
    public static WebElement allDropDown;

    public void advanceSearchFor(String iteam) {
        jobContractType.sendKeys(iteam, Keys.ENTER);
    }

    public List<String> getJobType(String idName) {
        List<String> items = new ArrayList<>();
        items = getTextFromWebElements(idName);
        return items;
    }

    public void dropDownMethod(String idName) throws Exception {
        WebElement selectElement = driver.findElement(By.id(idName));
        Select select = new Select(selectElement);
        List<WebElement> allOptions = select.getOptions();
        for (int i = 0; i < allOptions.size(); i++) {
            String item = allOptions.get(i).getText();
            System.out.println(item);

            //Select selectDropDown=new Select();
//            select.selectByVisibleText(item);
//            sleepFor(1);
//             advanceSearchSubmit.click();
//            sleepFor(1);
//            navigateBack();

        }

    }


    public void dropDownCheck(String idName) throws Exception {
        WebElement dropDownType = driver.findElement(By.id(idName));
        List<WebElement> dropDownItems = dropDownType.findElements(By.id(idName));
        for (int i = 0; i < dropDownItems.size(); i++) {
            String txt = dropDownItems.get(i).getText();
            Select drop = new Select(driver.findElement(By.xpath(".//*[@id='jt']")));
            drop.selectByVisibleText(txt);
            advanceSearchSubmit.click();
            navigateBack();
        }
    }


}

