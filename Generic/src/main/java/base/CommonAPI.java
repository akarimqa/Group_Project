package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by DAGR8DON on 1/4/17.
 */
public class CommonAPI {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","/Users/DAGR8DON/Downloads/MentoringAutomation20170103-master-2/Generic/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        driver = null;
    }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }
    public void typeByXpath(String locator, String value) {
        //driver.findElement(By.xpath(locator)).sendKeys(value);
        WebElement searchBox = driver.findElement(By.xpath(locator));
        //searchBox.sendKeys(Keys.chord(Keys.SHIFT,"packt publishing"));
        searchBox.sendKeys(value);
        searchBox.submit();
    }


}
