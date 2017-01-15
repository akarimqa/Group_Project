package HomePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

/**
 * Created by ahmadkarim on 1/9/17.
 */
public class TestHomePage extends CommonAPI{

    @Test(priority = 0)
    public void testHomePageTittle(){
        //Not finished yet Still implementing PageFactory clases n Methods..for Mafi Bhai
       if((driver.findElement(By.cssSelector(".span6.brand>a>img")).isDisplayed())==true){
           System.out.println("Navigated to the MetroPlus Home page");
       }
       else{System.out.println("Could not load the Metroplus home page");}

    }






}
