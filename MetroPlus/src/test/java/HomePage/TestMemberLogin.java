package HomePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ahmadkarim on 1/11/17.
 */
public class TestMemberLogin extends CommonAPI {

//Not finished yet Still working on it n implementing PageFactory clases n Methods..for Mafi Bhai


    @Test(priority = 1)
    public void IncorrectMemberLoginBlank() throws InterruptedException{
        // driver.findElement(By.cssSelector(".last>span")).click();
        // clickByXpath("html/body/form/header/div/div[1]/div/div/div/ul/li[5]/ul/li[1]/a");
        Actions action=new Actions(driver) ;
        //WebElement memberLogin= (WebElement) action.moveToElement(driver.findElement(By.cssSelector(".last>span"))).moveToElement(driver.findElement(By.xpath("html/body/form/header/div/div[1]/div/div/div/ul/li[5]/ul/li[1]/a"))).click();
        action.moveToElement(driver.findElement(By.cssSelector(".last>span"))).moveToElement(driver.findElement(By.xpath("html/body/form/header/div/div[1]/div/div/div/ul/li[5]/ul/li[1]/a"))).click().build().perform();
        // memberLogin.click();
        //Thread.sleep(5000);
        if((driver.findElement(By.cssSelector("#credentials_table_header")).isDisplayed())==true){
            System.out.println("Navigated to the MetroPlus Login page");
        }
        else{System.out.println("Could not load the Metroplus Login page");}
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.cssSelector("#credentials_table_header")).getText().contains("Sign In: Members"));
        //driver.findElement(By.cssSelector(".credentials_input_submit")).click();
        clickByCss(".credentials_input_submit");
        if((driver.findElement(By.cssSelector("#credentials_table_postheader>font>font")).isDisplayed())==true){
            System.out.println("Incorrect Member Login without user info credential check-passed");
        }
        else {System.out.println("Incorrect Member Login without user info credential check-Failed");}

    }

@Test(priority = 2)
    public void IncorrectMemberLoginWithWrongInfo() throws InterruptedException{

        Actions action=new Actions(driver) ;
       action.moveToElement(driver.findElement(By.cssSelector(".last>span"))).moveToElement(driver.findElement(By.xpath("html/body/form/header/div/div[1]/div/div/div/ul/li[5]/ul/li[1]/a"))).click().build().perform();
       Thread.sleep(3000);
       typeByXpath("html/body/table[2]/tbody/tr[1]/td/form/table/tbody/tr[3]/td/input","abcdefg");
       Thread.sleep(3000);
       typeByXpath("html/body/table[2]/tbody/tr[1]/td/form/table/tbody/tr[4]/td/input","1234567");

        clickByCss(".credentials_input_submit");

    if((driver.findElement(By.cssSelector("#credentials_table_postheader>font>font")).isDisplayed())==true){
        System.out.println("Incorrect Member Login with wrong user info credential check-passed");
    }
    else {System.out.println("Incorrect Member Login with wrong user info credential check-Failed");}

    }



}
