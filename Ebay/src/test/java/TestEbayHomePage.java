import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/8/17.
 */
public class TestEbayHomePage extends CommonAPI {
    @Test
    public void TestHomePage() throws Exception{
        //clickByXpath(".//*[@id='nav-logo']/a[1]/span[1]");
        typeByXpath("html/body/div[3]/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input","Computer");
        driver.findElement(By.xpath("html/body/div[5]/div[1]/div[1]/div[2]/div/span[2]/a[1]/b")).isDisplayed();
    }
    @Test
    public void TestClick() throws InterruptedException {
        Actions builder=new Actions(driver);
        WebElement we = driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[1]/div/table/tbody/tr/td[2]/span"));
        builder.moveToElement(we).perform();
        driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[1]/div/table/tbody/tr/td[2]/div[2]/div/div[1]/div[2]/div/ul/li[1]/a")).click();
        Thread.sleep(500);

    }

}
