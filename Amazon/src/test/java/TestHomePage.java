import base.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/4/17.
 */
public class TestHomePage extends CommonAPI {
@Test
    public void checkHomePage(){
    clickByXpath(".//*[@id='nav-logo']/a[1]/span[1]");
    typeByXpath(".//*[@id='twotabsearchtextbox']","Christmas");
    driver.findElement(By.xpath(".//*[@id='amsSparkleAdBrandImg']")).isDisplayed();
}
@Test
    public void MouseHovering() throws InterruptedException {
    Actions builder=new Actions(driver);
    builder.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]"))).moveToElement(driver.findElement(By.xpath(".//*[@id='nav-al-your-account']/a[1]/span"))).click().build().perform();
    Thread.sleep(5000);
    //driver.findElement(By.xpath(".//*[@id='nav-subnav']/a[4]/span")).isDisplayed();

    }
}
